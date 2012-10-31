var lets = ["b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"];

var vow = ["a","e","i", "o","u"];

var five = function(){
     return vow[(Math.floor(Math.random() * vow.length))];    
};

var six = function(){
     return lets[(Math.floor(Math.random() * lets.length))];
};

console.log(six()+five()+six()+five()+five()+six() ); 