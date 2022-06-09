$(function() {
		$('#submit').click(function() {
			var userID = $('#userID').val();
    var password = $('#password').val();


    if (userID == "") {
        alert("아이디를 입력해주세요.");
    } else if (password == "" ){
        alert("비밀번호를 입력해주세요.");
    } else {
	$.ajax({
		url : "login.do",
		type : 'GET',
		dataType : "TEXT",
		data : {
			"id" : userID,
			"pw" : password,
		},
        success : function(data){
			$('#result').html(data)
		},
        error: function(data){
			alert("실패" + data)
		}
		});
	}
		});
});