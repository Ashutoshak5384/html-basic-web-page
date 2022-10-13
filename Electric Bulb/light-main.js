
const imgBtn = document.querySelector(".imgOnOFF")
const btn = document.querySelector(".btn");
btn.addEventListener("click",function(){
    if(btn.textContent == "ON"){
        btn.textContent = "OFF";
        // imgBtn.src="image/Images/ON.png";
        imgBtn.src="https://sm8uti.github.io/Javascript-Projects/Electric%20Bulb/Images/extra.png";
    }
    else{
        btn.textContent = "ON";
        imgBtn.src="https://sm8uti.github.io/Javascript-Projects/Electric%20Bulb/Images/Off.png";
    }
});


