$(function($) {
	$("#exit").click( function () {
		if(window.confirm('你确定要退出吗？')){
			
			window.location.href = "http://localhost:8888/aviation/reception/exit"
	     }else{
	        return false;
	    }
	});
});


