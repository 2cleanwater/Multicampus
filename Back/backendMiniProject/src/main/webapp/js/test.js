function checkemailaddy(){
    
    if (form.email_select.value == '1') {

        form.email2.readonly = false;

        form.email2.value = '';

        form.email2.focus();

    }

    else {

        form.email2.readonly = true;

        form.email2.value = form.email_select.value;

    }

}