var UiEngine = {
    ajax: function(url, target) {
        UiEngine.updateCookies();
        $('#' + target).load(url,
        function(responseTxt, statusTxt, xhr) {
            if (statusTxt == "error") {
                alert("Error: " + xhr.status + ": " + xhr.statusText);
            }
        });
    },
    updateCookies: function() {
        var inputs = document.getElementsByTagName('input');
        for (var i = 0; i < inputs.length; i++) {
            var input = inputs[i];
            if (input.id != '') {
                cookie.set('uiEngine.input.' + input.id, encodeURIComponent(input.value));
            }
        }
    }
}