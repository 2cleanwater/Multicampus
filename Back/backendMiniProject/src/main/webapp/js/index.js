function openModal(modalname){
    document.get
    $("#modal").fadeIn(300);
    $("."+modalname).fadeIn(300);
}

$(function(){
    $("#modal, .close").on('click',function() {
        $("#modal").fadeOut(300);
        $(".modal_con").fadeOut(300);
    });
});

