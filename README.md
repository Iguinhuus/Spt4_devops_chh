Instruções:

##  Testar no Azure DevOps 

### 1. Clone o projeto:
bash
git clone https://github.com/seu-usuario/sprint04-java.git


### 2. Abra o Azure DevOps e siga os passos
- Criar um novo projeto
- Criar uma pipeline apontando para este repositório GitHub
- Confirmar que o arquivo azure-pipelines.yml está na raiz

### 3. Conectar com Azure (uma vez):
- Em *Project Settings > Service Connections* → criar uma conexão chamada:
  
MyazureSubscription


### 4. Execute a Pipeline
- Ela irá:
    - Criar o grupo de recurso, plano e App Service
    - Fazer o build do .jar
    - Publicar o deploy em:

https://odontoprev-rm554227.azurewebsites.net/medicos


### 5. Teste as Funcionalidades
- Acessar /medicos/novo e cadastrar um médico
- Acessar /pacientes/novo e cadastrar um paciente
- Verificar os dados salvos no MongoDB Atlas (coleções: medicos e pacientes)

---

## MongoDB Atlas
- Banco: banco_challenge
- Coleções criadas: medicos, pacientes

---

##Scripts JSON (aplicável para API REST)
> **não é necessário enviar scripts JSON**.

---

##  Observações para teste
- O deploy pode levar de 1 a 2 minutos.
- A aplicação já foi testada.
- A estrutura segue MVC com DTOs e validação integrada

---

##  Elaborado pela equipe:

-Igor Oviedo RM553434
-Cauã Loureiro RM553093
-Thiago Carrillo RM553565
