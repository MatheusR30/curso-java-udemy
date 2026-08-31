function Conexao() {
    // Cria um novo objeto XMLHttpRequest
    const xhr = new XMLHttpRequest();

    // Configura a solicitaçãom especificando o método (GET) e a URL
    xhr.open('GET', 'https://jsonplaceholder.typicode.com/posts/1', true);

    // Define uma função de callback para lidar com a resposta
    xhr.onload = function() {
        if (xhr.status === 200) {
            // A solicitação foi bem-sucedida, e o status da resposta é 200 (OK)
            const response = JSON.parse(xhr.responseText);
            console.log('Título do post:', response.title);
        } else {
            // A solicitação falhou
            console.log('Ocorreu um erro durante a solicitação. ');
        }
    };

    // Envia a solicitação
    xhr.send();
}