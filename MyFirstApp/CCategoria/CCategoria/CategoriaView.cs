using System;
using System.Data;
namespace CCategoria
{
	public partial class CategoriaView : Gtk.Window
	{
		public CategoriaView () : 
				base(Gtk.WindowType.Toplevel)
		{
			this.Build ();
			Console.WriteLine("saveAction.Activated");
			saveAction.Activated += delegate {
				IDbCommand dbCommand = App.Instance.DbConnection.CreateCommand();

				dbCommand.CommandText = "insert into categoria (nombre) values (@nombre)";

				String nombre = entryNombre.Text;

				IDbDataParameter dbDataParameter = dbCommand.CreateParameter();
				dbDataParameter.ParameterName = "nombre";
				dbDataParameter.Value = nombre;
				dbCommand.Parameters.Add(dbDataParameter);

				dbCommand.ExecuteNonQuery();
			};
		}
	}
}