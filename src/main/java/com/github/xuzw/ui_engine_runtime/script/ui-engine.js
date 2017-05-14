var UiEngine = {
	click : function(source) {
		cookie.set('uiEngine.eventType', source.id);
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
		cookie.remove('uiEngine.eventType');
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
