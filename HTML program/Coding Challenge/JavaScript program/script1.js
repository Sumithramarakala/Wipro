function sayHello()
{
    alert("Hii all!! click button to get total");

}
function showTotal(){
    var num1=40;
    var num2=50;
    var total=num1+num2;
    alert("Total is: "+total);
     
}
const helloButton = document.getElementById("button1");
const totalButton = document.getElementById("button2");

helloButton.addEventListener('click',sayHello);
totalButton.addEventListener('click', showTotal);