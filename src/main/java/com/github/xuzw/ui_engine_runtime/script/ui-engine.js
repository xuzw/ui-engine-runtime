var UiEngine = {
    click: function(source) {
        var div = source.parentNode;
        cookie.set('uiEngine.event.type', source.dataset.clickEventClass);
        cookie.set('uiEngine.event.location.className', div.className);
        cookie.set('uiEngine.event.location.id', div.id);
        this.updateCookies();
        this.refresh();
    },
    updateCookies: function() {
        var inputs = document.getElementsByTagName('input');
        for (var i = 0; i < inputs.length; i++) {
            var input = inputs[i];
            if (input.id != '') {
                cookie.set('uiEngine.input.' + input.id, encodeURIComponent(input.value));
            }
        }
    },
    deleteCookies: function() {
        var cookies = cookie.all();
        for (var x in cookies) {
            if (x.startsWith('uiEngine.')) {
                cookie.remove(x);
            }
        }
    },
    refresh: function() {
        window.location.reload();
    },
    init: function() {
        this.deleteCookies();
    },
    closePopup: function() {
    	var maskDivs = document.getElementsByClassName('com-github-xuzw-ui_engine_runtime-div-MaskDiv');
    	for (var i = 0; i < maskDivs.length; i++) {
        	maskDivs[i].parentNode.removeChild(maskDivs[i]);
		}
    	var popupDivWrappers = document.getElementsByClassName('com-github-xuzw-ui_engine_runtime-div-wrapper-PopupDivWrapper');
    	for (var i = 0; i < popupDivWrappers.length; i++) {
    		popupDivWrappers[i].parentNode.removeChild(popupDivWrappers[i]);
		}
    }
}

UiEngine.init();