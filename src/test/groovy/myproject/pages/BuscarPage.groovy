package myproject.pages

import geb.Page

class BuscarPage extends Page {
		
	static url = "wiki/Especial:Buscar"

	static at = {
		title == 'Buscar - Wikipedia, la enciclopedia libre'
	}

	static content = {
		campoBusqueda { $("input", name:"search")[0] }
		botonBusqueda { $("button", text:"Buscar") }
	}
}

