var UiEngine = {
	click : function(source) {
		var div = source.parentNode;
		cookie.set('uiEngine.event.type', source.dataset.clickEventClass);
		cookie.set('uiEngine.event.location.className', div.className);
		cookie.set('uiEngine.event.location.id', div.id);
		this.updateCookies();
		this.refresh();
	},
	updateCookies : function() {
		var inputs = document.getElementsByTagName("input");
		for (var i = 0; i < inputs.length; i++) {
			var input = inputs[i];
			cookie.set('uiEngine.input.' + input.id, input.value);
		}
	},
	deleteCookies : function() {
		cookie.remove('uiEngine.event.type');
		var cookies = cookie.all();
		for ( var x in cookies) {
			if (x.startsWith('uiEngine.input.')) {
				cookie.remove(x);
			}
		}
	},
	refresh : function() {
		window.location.reload();
	},
	init : function() {
		this.deleteCookies();
	}
}

UiEngine.init();
