var priceOfPhone=45000;
var bankBalance=60000;
if(priceOfPhone<bankBalance){
    console.log("All ok ! Payment processed");

}
else if(priceOfPhone<bankBalance){
    console.log("Soory ! You do not have sufficient balance");
}
else {
    console.log("Exit");

}
function sum( x,  y){
    return x+y;

}
var result=sum(4,5);
console.log(result);

var sum1=function (x,y){
    return x-y;
}
//var res=sum1(6,5);
console.log(sum1(6,5));

var days=[
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"

];
console.log(days[2]);
for(var i=0;i<days.length;i++){
    console.log(days[i]);

}
