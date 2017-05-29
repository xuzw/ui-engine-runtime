var UiEngine = {
    loadScript: function(url) {
        UiEngine.updateCookies();
        $.ajax({
            url: url,
            success: function(responseTxt) {
                $(document.body).append(responseTxt);
            },
            error: function(jqXhr, textStatus, errorThrown) {
                alert('loadScript error: ' + jqXhr.status);
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