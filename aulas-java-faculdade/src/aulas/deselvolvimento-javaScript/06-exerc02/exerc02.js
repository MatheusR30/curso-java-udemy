// iniciando o canvas
var canvas = document.getElementById('progress')
var ctx =  canvas.getContex('2d');

// configurações
var x = 0;
var y = 0;
var alutra = 10;
var largura = 0;
var fator = 60;
var resolucao = 1280;

// cor da barra requisitada pela equipe
ctx.fillStyle =  '#4169E1';

// função que anima a barra de progresso
function animacao() {
    ctx.fillStyle(x,y, largura = largura + fator, altura);

    // codigo avançado: interrompe a funcao setInterval()
    //                  para evitar carregamento excessivo
    if(largura > resolucao) {
        clearInterval(atualiza);
    }
}