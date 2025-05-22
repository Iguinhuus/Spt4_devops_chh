1️⃣ Baixe o projeto
No terminal, clone o repositório:

bash
Copiar
git clone https://github.com/seu-usuario/sprint04-java.git
2️⃣ Configure a pipeline no Azure DevOps
Crie um projeto novo no Azure DevOps

Configure uma pipeline vinculada ao repositório GitHub clonado

Verifique se o arquivo azure-pipelines.yml está presente na raiz do projeto

3️⃣ Estabeleça a conexão com o Azure
Vá até Configurações do Projeto > Service Connections

Crie uma conexão nomeada exatamente:

nginx
Copiar
MyazureSubscription
Essa conexão garante que a pipeline possa criar e gerenciar recursos na sua conta Azure.

4️⃣ Execute a pipeline
Ao executar, a pipeline irá:

Criar o grupo de recursos, plano e App Service no Azure

Gerar o build do artefato .jar

Publicar a aplicação automaticamente no endereço:

bash
Copiar
https://odontoprev-rm554227.azurewebsites.net/medicos
5️⃣ Valide a aplicação
Acesse /medicos/novo para cadastrar médicos

Acesse /pacientes/novo para cadastrar pacientes

Verifique os dados salvos no MongoDB Atlas, nas coleções:

medicos

pacientes

🗄️ Banco de Dados MongoDB Atlas
Banco utilizado: odontoprevdb

As coleções medicos e pacientes são criadas automaticamente ao rodar a aplicação pela primeira vez.

⚙️ Sobre os testes e API REST
A aplicação utiliza Thymeleaf com formulários HTML para interação, portanto:

Não é necessário usar scripts JSON para os testes manuais.

⚠️ Observações Importantes
O deploy inicial pode levar até 2 minutos

Cadastro, edição e exclusão foram testados e estão funcionando corretamente

Arquitetura MVC organizada, com DTOs e validação já implementadas

👨‍💻 Desenvolvido por
Igor Mendes Oviedo

Thiago Carrilo

Cauã
