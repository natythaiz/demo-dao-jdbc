**Demo DAO JDBC** 
Este projeto é uma aplicação Java desenvolvida para consolidar conhecimentos em JDBC (Java Database Connectivity) e persistência de dados. A aplicação realiza o gerenciamento completo (CRUD) de vendedores e departamentos, utilizando o banco de dados MySQL.

**Tecnologias e Ferramentas**
- Java: Linguagem base do projeto.
- JDBC API: Utilização dos pacotes java.sql para operações de dados.
- DBeaver: Ferramenta de administração de banco de dados utilizada para gerenciar o MySQL.
- MySQL: Sistema de gerenciamento de banco de dados relacional.
- Eclipse: IDE utilizada para o desenvolvimento e configuração da Build Path.

**Arquitetura e Padrões de Projeto**
O projeto foi estruturado seguindo rigorosamente o padrão DAO (Data Access Object), garantindo que a lógica de acesso ao banco de dados fique isolada da lógica da aplicação.
- Interfaces DAO: Definição de contratos para SellerDao e DepartmentDao.
- Implementações JDBC: Classes específicas (SellerDaoJDBC e DepartmentDaoJDBC) que contêm o código SQL.
- DaoFactory: Utilização do padrão Factory para injeção de dependência, evitando o acoplamento direto com as implementações.
- Tratamento de Exceções: Implementação de exceções personalizadas como DbException e DbIntegrityException para capturar erros de conexão e falhas de integridade referencial.

**Funcionalidades Implementadas**
- Recuperação de dados: Uso de Statement e ResultSet para consultas.
- Inserção com recuperação de ID: Uso de PreparedStatement e RETURN_GENERATED_KEYS.
- Atualização e Deleção: Operações seguras com parâmetros e tratamento de integridade.

**Configuração do Projeto**
- Banco de Dados: Criar o schema coursejdbc no DBeaver/MySQL.
- Driver: Baixar e configurar o MySQL Java Connector na User Library do projeto.
- Propriedades: O projeto lê as credenciais de um arquivo db.properties externo

_Projeto realizado sob a orientação do Prof. Dr. Nelio Alves_
