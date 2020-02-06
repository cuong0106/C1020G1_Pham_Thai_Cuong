/**
 * Created by nhatnk on 4/26/17.
 */

var huongDiChuyen='phai';
var speed=30;
var tRandom;


function Hero(image, top, left, size,step){
  this.image = image;
  this.top = top;
  this.left = left;
  this.size = size;
  this.step = step;

  this.getHeroElement = function(){
    return '<img width="'+ this.size + '"' +
      ' height="'+ this.size + '"' +
      ' src="' + this.image +'"' +
      ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
  };

  this.moveRight = function(){
    this.left += this.step;
    console.log('ok: ' + this.left);
  };
  this.moveDown = function(){
    this.top += this.step;
  };
  this.moveLeft = function(){
    this.left -= this.step;
  };
  this.moveTop = function(){
    this.top -= this.step;
  };
}

var hero = new Hero('pikachu.png', 25, 0, 200,1);


function start(){
  if(huongDiChuyen==='phai')
  if(hero.left < window.innerWidth - hero.size){
    hero.moveRight();
  }
  if(huongDiChuyen==='xuong')
    if(hero.top < window.innerHeight - hero.size){
      hero.moveDown();
    }
  if(huongDiChuyen==='trai')
    if(hero.left >0){
      hero.moveLeft();
    }
  if(huongDiChuyen==='len')
    if(hero.top > 25){
      hero.moveTop();
    }
  document.getElementById('game').innerHTML = hero.getHeroElement();
  setTimeout(start, speed);
}


function set1(){
  hero.step=parseInt(document.getElementById('step').value);
  speed=parseInt(document.getElementById('speed').value);
  huongDiChuyen='phai';
  clearTimeout(tRandom);

}
function set2(){
  hero.step=parseInt(document.getElementById('step').value);
  speed=parseInt(document.getElementById('speed').value);
  huongDiChuyen='xuong';
  clearTimeout(tRandom);
}
function set3(){
  hero.step=parseInt(document.getElementById('step').value);
  speed=parseInt(document.getElementById('speed').value);
  huongDiChuyen='trai';
  clearTimeout(tRandom);
}
function set4(){
  hero.step=parseInt(document.getElementById('step').value);
  speed=parseInt(document.getElementById('speed').value);
  huongDiChuyen='len';
  clearTimeout(tRandom);
}
function set5(){
  hero.step=parseInt(document.getElementById('step').value);
  speed=parseInt(document.getElementById('speed').value);
  let bienRandom=Math.random()*4;
  if(bienRandom>3){
    huongDiChuyen='phai';
  }else if(bienRandom>2){
    huongDiChuyen='xuong';
  }else if(bienRandom>1){
    huongDiChuyen='trai';
  }else{
    huongDiChuyen='len';
  }
  tRandom=setTimeout(set5, Math.random()*4000);







}


start();