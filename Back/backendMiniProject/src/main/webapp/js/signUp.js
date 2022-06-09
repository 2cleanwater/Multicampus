function signUpVal() {
    
    let mailCheck = RegExp(/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/);
    let mail = "";
    let pwdCheck = RegExp(/^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{10,}$/);
    let link = './signUp_suc.html';

    // null 체크
    if($("#userID").val() == "") {
        alert("아이디를 입력해주세요");
        $("#uesrID").focus();
        return false;
    } else if($("#email_domain").val() == "") {
        alert("도메인을 입력해주세요");
        $("#email_domain").focus();
        return false;
    } else if($("#userPW").val() == "") {
        alert("비밀번호를 입력해주세요");
        $("#userPW").focus();
        return false;
    } else if($("#userPW_check").val() == "") {
        alert("비밀번호를 재입력해주세요");
        $("#userPW_check").focus();
        return false;
    } else if($("#userTel_2").val() == "") {
        alert("전화번호를 입력해주세요");
        $("#userTel_2").focus();
        return false;
    } else if($("#userTel_3").val() == "") {
        alert("전화번호를 입력해주세요");
        $("#userTel_3").focus();
        return false;
    }
    
    // 아이디 메일 체크
    mail = $("#userID").val()+"@"+$("#email_domain").val();

    if(!mailCheck.test(mail)) {
        alert("아이디 형식에 맞게 입력해주세요");
        $("#userID").focus();
        return false;
    }

    // 패스워드 체크

    if(!pwdCheck.test($("#userPW").val())) {
        alert("비밀번호 양식이 맞지 않습니다.");
        $("#userPW").focus();
        return false;
    }

    if($("#userPW").val() != $("#userPW_check").val()) {
        alert("비밀번호가 동일하지 않습니다.");
        $("#userPW_check").val("");
        $("#userPW_check").focus();
        return false;
    }

    document.signUp.submit();
    location.replace(link);
}

function setDomain() {
    if (signUp.domain_select.value == '1') {
        signUp.email_domain.readonly = false;
        signUp.email_domain.value = '';
        signUp.email_domain.focus();
    }

    else {
        signUp.email_domain.readonly = true;
        signUp.email_domain.value = signUp.domain_select.value;
    }
}