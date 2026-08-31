// Seleciona os elementos
const emailInput = document.querySelector("#emailInput");
const resultMessage = document.querySelector("#resultMessage");
const emailForm = document.querySelector("#emailForm");

// Um evento que controla/ativa apos a subimissao do form
emailForm.addEventListener("submit", function (event) {
  event.preventDefault();

  const email = emailInput.value;

// Validar email
  const isValid = validateEmail(email);
  
  if(isValid) {
    resultMessage.textContent = "E-mail válido";
    resultMessage.style.color = "green";
  } else {
    resultMessage.textContent = "E-mail inválido";
    resultMessage.textContent = "Exemplo: matheus@exemplo.com";
    resultMessage.style.color = "red";
}

});
// Função de validar e-mail
const validateEmail = (email) => {
// Padrão: TEXTO@TEXTO.TEXTO
const regex = /^[^\s]+@[^\s]+\.[^\s]+$/;
return regex.test(email);
}