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
    hideElement: function(id) {
        document.getElementById(id).style.display = "none";
    },
    showElement: function(id) {
        document.getElementById(id).style.display = "block";
    },
    hidePopupMask: function() {
        this.hideElement('com-github-xuzw-ui_engine_runtime-page-popup-PopupMaskDiv');
    },
    showPopupMask: function() {
        this.showElement('com-github-xuzw-ui_engine_runtime-page-popup-PopupMaskDiv');
    },
    hidePopup: function(id) {
        this.hidePopupMask();
        this.hideElement(id);
    },
    showPopup: function(id) {
        this.showPopupMask();
        this.showElement(id);
    }
}

UiEngine.init();

