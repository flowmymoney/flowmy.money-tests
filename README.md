# Objetivo

O repositório [test-automation-selenium](https://github.com/flowmymoney/test-automation-selenium) é dedicado a
manutenção e criação de testes automatizados para o projeto de gestão de finanças
pessoais, [flowmy.money](https://github.com/flowmymoney). Para garantir que o proejto funcione conforme esperado em
todas as suas funcionalidades, após alterações no código-fonte. Os testes automatizados são projetados para identificar
possíveis regressões e falhas, este repositório contém uma extensa suíte de testes automatizados que visam garantir a
qualidade, confiabilidade e desempenho do software, garantindo assim uma experiência consistente para os usuários
finais.

# Organização e estrutra projeto

A estrutra deste projeto de automação é uma combinação de frameworks e ferramentas robustas para garantir a
confibilidade nos testes: [_Selenium_](https://www.selenium.dev/), [_Cucumber_](https://cucumber.io/) e [_Rest
Assured_](https://rest-assured.io/) rodando em cima de containers [Docker](https://www.docker.com/).

A utilização do [_Selenium_](https://www.selenium.dev/) se da seguindo os principios de:

1. Reutilização, com Page Objects;
2. Domain specific language (DSL);
3. Test independency;
4. Fluent API;
5. Fresh browser per test.

# 🏗️ Construção da aplicação

```shell
docker-compose up -d
```

http://localhost:4444/ui/