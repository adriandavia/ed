using System;
using Gtk;
using System.Diagnostics;
using System.Collections.Generic;

public partial class MainWindow: Gtk.Window
{	
	private Random random; 
	private readonly Gdk.Color GREEN_COLOR = new Gdk.Color(0, 255, 0);
	private Table table;
	private List<int> numeros;
	private List<Button> buttons;
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		random = new Random ();
		table = new Table (9, 10, true);
		numeros = new List<int> ();
		buttons = new List<Button> ();

		//Opción 1
		for (uint index = 0; index < 90; index++) {
			uint row = index / 10;
			uint column = index % 10;
			int numero = (int)index + 1;
			addButton (numero, row, column);
			numeros.Add (numero);
		}

		//Opción 2
		//		for (uint row = 0; row < 9; row++)
		//			for (uint column=0; column < 10; column++) {
		//				uint index = row * 10 + column;
		//				Button button = new Button ();
		//				button.Label = (index + 1).ToString();
		//				button.Visible = true;
		//				table.Attach (button, column, column + 1, row, row + 1);
		//			}



		table.Visible = true;
		vbox1.Add (table);

		buttonNumero.Clicked += delegate {
			int numero = getNumero();
			show(numero);
			buttonNumero.Sensitive = numeros.Count > 0;
			espeak(numero);

		};


	}

	private int getNumero(){

		int indexAleatorio = random.Next (numeros.Count);
		int numero = numeros[indexAleatorio];
		numeros.RemoveAt(indexAleatorio);
		return numero;

	}

	private void show(int numero){

		labelNumero.Text = numero.ToString();
		Button button = buttons[numero -1];
		button.ModifyBg (StateType.Normal, GREEN_COLOR);


	}

	private void espeak(int numero){

		string text = numero.ToString ();
		if (text.Length == 2) 
			//Process.Start ("\"" + text + " " + text [0] + " " + text [1] + "\""); Concatenacion
			text = string.Format("\"{0} {1} {2}\"", text, text [0], text [1]);

			Process.Start ("espeak", "-v es " + text);

	}

	private void addButton(int numero, uint row, uint column){


		Button button = new Button ();
		button.Label = numero.ToString();
		button.Visible = true;
		table.Attach (button, column, column + 1, row, row + 1);
		buttons.Add (button);

	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
