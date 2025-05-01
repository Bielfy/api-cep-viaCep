# API CEP ViaCEP

Este projeto tem como objetivo integrar com a API pública ViaCEP para consultar endereços a partir de CEPs informados via terminal e salvar as informações relevantes em um arquivo `.json` chamado `Endereco.json`. As informações coletadas incluem logradouro, bairro, cidade, estado e outros dados fornecidos pela API.

## Como Usar

### Inicie o programa:

Execute o programa no terminal (veja instruções abaixo).

### Pesquisar um CEP:

Insira o número do CEP quando solicitado. O programa fará a requisição para a API ViaCEP e armazenará os dados no arquivo `Endereco.json`.

### Sair do programa:

Para encerrar o programa, digite `sair` no terminal.

### Verifique o arquivo Endereco.json:

Após realizar a busca, os dados estarão salvos em `src/main/java/br/com/endereco/resources/Endereco.json`.

## Recursos

- **Interface via Terminal simples**: Permite a consulta de endereços diretamente via terminal.
- **Uso de Maven e Gson**: O projeto utiliza Maven para gerenciamento de dependências, incluindo a biblioteca Gson para manipulação de dados JSON.
- **Tratamento de exceções**: Validação de entrada e tratamento de erros de requisição para garantir uma experiência robusta.

## Instalação

1. Clone o repositório:  
   ```bash
   git clone https://github.com/Bielfy/api-cep-viaCep.git
   ```

2. Navegue até o diretório do projeto:  
   ```bash
   cd api-cep-viaCep
   ```

3. Compile o projeto usando Maven:  
   ```bash
   mvn clean install
   ```

4. Execute o programa:  
   ```bash
   mvn exec:java
   ```

## Estrutura do Projeto

- **`src/`**: Contém o código-fonte do projeto.  
- **`Endereco.json`**: Arquivo gerado com os dados das consultas de CEP. 
- **`pom.xml`**: Arquivo de configuração do Maven, que gerencia as dependências do projeto.

## Contribuições

Sinta-se à vontade para fazer melhorias no código ou sugerir novas funcionalidades. Se você encontrar algum problema, crie uma issue ou envie um pull request.

---

Este projeto foi criado por **Gabriel T**.
