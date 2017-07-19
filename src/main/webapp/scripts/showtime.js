/**
 * Created by Administrator on 2017/7/19.
 */
window.onload = function() {

    var date = new Date();

    var y = date.getFullYear();

    var m = date.getMonth();

    var d = date.getDate();

    var h=date.getHours();

    var m1=date.getMinutes();  var s=date.getSeconds();

    document.getElementById('dateNav').innerHTML="今天是："+y+"年"+(m+1)+"月"+d+"日";

    document.getElementById('timeNav').innerHTML=h+"时"+m1+"分"+s+"秒";
};

//每秒执行一次
setInterval("window.onload()", 1000);
