using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonSumaClicked (object sender, EventArgs e)
	{
		decimal numero1 = decimal.Parse(entryNumero1.Text);
		decimal numero2 = decimal.Parse (entryNumero2.Text);
		decimal resultado = numero1 + numero2;

		labelResultado.Text = resultado.ToString ();
	}
}