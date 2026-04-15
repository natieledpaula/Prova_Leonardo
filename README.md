# 📱 Cadastro de Produtos para Loja Virtual

## 🧾 Descrição do Projeto

Este projeto consiste no desenvolvimento de um aplicativo Android simples para uma loja de produtos eletrônicos que deseja modernizar o controle de estoque.

Atualmente, o controle é feito manualmente em um caderno, o que dificulta a organização e a visualização dos produtos. O aplicativo tem como objetivo facilitar esse processo, permitindo o cadastro e a listagem de produtos de forma prática e eficiente.

---

## 🎯 Objetivo

Desenvolver um aplicativo funcional no Android Studio utilizando **Java** e **Room Database**, contendo no mínimo duas telas:

* 📌 Tela de Cadastro de Produto
* 📌 Tela de Listagem de Produtos

---

## ⚙️ Funcionalidades

### 📝 Cadastro de Produto

O aplicativo permite cadastrar produtos com os seguintes campos:

* Nome do produto
* Código do produto (alfanumérico)
* Preço (em reais)
* Quantidade em estoque

### ✅ Validações

* Nenhum campo pode estar vazio
* O preço deve ser um número positivo com até duas casas decimais
* A quantidade deve ser um número inteiro positivo

---

### 📋 Listagem de Produtos

* Exibição dos produtos cadastrados
* Informações mostradas:

  * Nome
  * Código
  * Preço
* Atualização automática ao retornar para a tela
* Navegação entre telas (cadastro ↔ listagem)

---

## 🗄️ Armazenamento de Dados

O aplicativo utiliza o **Room Database** para armazenamento local.

### Componentes implementados:

* **Entity:** `Product`
* **DAO:** `ProductDao`

  * Inserção de produtos
  * Listagem de produtos
* **Database:** `ProductDatabase`

---

## 🧩 Tecnologias Utilizadas

* Android Studio
* Linguagem Java
* Room Database
* RecyclerView
* Componentes de UI do Android (EditText, Button, ScrollView)
* Navegação entre Activities

---

## 💡 Observações

* As operações de banco de dados são executadas em **threads separadas**, evitando travamentos na interface.
* O aplicativo foi desenvolvido com foco em simplicidade e funcionalidade.
* Todos os conceitos utilizados foram baseados em conteúdos apresentados em aula.

---

## 👨‍💻 Autor

Projeto desenvolvido como atividade acadêmica para prática de desenvolvimento Android com Java e Room Database.
