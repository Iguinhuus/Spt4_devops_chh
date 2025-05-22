Guia rápido para testes no Azure DevOps (para avaliação)
Passo 1: Baixar o projeto
No terminal, execute:

bash
Copiar
git clone https://github.com/seu-usuario/sprint04-java.git
Passo 2: Configurar pipeline no Azure DevOps
Crie um novo projeto dentro do Azure DevOps

Configure uma pipeline apontando para o repositório clonado no GitHub

Confira se o arquivo azure-pipelines.yml está localizado na raiz do repositório

Passo 3: Criar conexão com Azure
Navegue até Configurações do Projeto > Service Connections

Configure uma nova conexão chamada exatamente:

nginx
Copiar
MyazureSubscription
Isso é necessário para que a pipeline tenha permissão de gerenciar recursos na sua conta do Azure.

Passo 4: Rodar a pipeline
A execução fará o seguinte automaticamente:

Criará os recursos necessários no Azure (grupo, plano e App Service)

Compilará o artefato .jar da aplicação

Publicará a aplicação no endereço:

bash
Copiar
https://odontoprev-rm554227.azurewebsites.net/medicos
Passo 5: Validar funcionamento
Acesse a URL /medicos/novo para incluir médicos

Use /pacientes/novo para inserir pacientes

Consulte o MongoDB Atlas para verificar as coleções medicos e pacientes

MongoDB Atlas
Banco: odontoprevdb

As coleções são criadas automaticamente pela aplicação

Observações importantes
O primeiro deploy pode levar alguns minutos para ser concluído

Testes manuais de cadastro, edição e exclusão foram realizados com sucesso

Arquitetura MVC bem definida, com uso de DTOs e validação incorporada

Time de desenvolvimento
Igor Mendes Oviedo

Thiago Carrilo

Cauã
