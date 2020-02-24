/**
 * Created by nhatnk on 4/26/17.
 */

var huongDiChuyen='phai';
var speed=20;
var tRandom;

var chieuHienThiHinhAnh='width';

function Hero(image, top, left, size,step){
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.step = step;

    this.getHeroElement = function(){
        return '<img '+chieuHienThiHinhAnh+'="'+ this.size + '"' +
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

var hero = new Hero('hinh anh/ha1.png', 35, 0, 150,1);

function start(){
    if(huongDiChuyen==='phai')
        if(hero.left < window.innerWidth - hero.size){
            hero.moveRight();
            hero.image='hinh anh/ha1.png';
            chieuHienThiHinhAnh='height';
        }
    if(huongDiChuyen==='xuong')
        if(hero.top < window.innerHeight - hero.size){
            hero.moveDown();
            hero.image='hinh anh/ha4.png';
            chieuHienThiHinhAnh='width';
        }
    if(huongDiChuyen==='trai')
        if(hero.left >0){
            hero.moveLeft();
            hero.image='hinh anh/ha3.png';
            chieuHienThiHinhAnh='height';
        }
    if(huongDiChuyen==='len')
        if(hero.top > 35){
            hero.moveTop();
            hero.image='hinh anh/ha4.png';
            chieuHienThiHinhAnh='width';
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
    tRandom=setTimeout(set5, Math.random()*document.getElementById('timer').value);
}
start();