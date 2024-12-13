//variavel pra pegar dados
const frm = document.querySelector("form");
//variaveis pra resposta
const resp = document.querySelector("#resp");

//clicar no botao nao enviar
frm.addEventListener("submit", (e) => {
    e.preventDefault(); //previnir o envio
    //variaveis inicias
    const nome = frm.elements["titulo"].value;
    const descricao = frm.elements["descricao"].value;
    const telefone = frm.elements["telefone"].value;
    const email = frm.elements["email"].value;
    if (nome == "") {
        resp.innerText = "Digite o Título!";
        frm.elements["titulo"].focus();
    } else if (descricao == "") {
        resp.innerText = "Digite a Descrição!";
        frm.elements["descricao"].focus();
    } else if (email == "") {
        resp.innerText = "Digite o email!";
        frm.elements["email"].focus();
    } else if (telefone == "") {
        resp.innerText = "Digite o Telefone!";
        frm.elements["telefone"].focus();
    } else {
        //aviso de sucesso
        resp.innerText = "Enviado com Sucesso";
        // Limpar os campos
        frm.reset();
        // Voltar o foco para o campo de título
        frm.elements["titulo"].focus();
    }
});
