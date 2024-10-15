# Projeto: Sistema Bancário em Java

## Descrição
Este projeto implementa um sistema bancário em Java, onde você pode gerenciar contas correntes, poupança e salário, realizar operações como saque, depósito, transferência e atualizar saldos. O projeto segue uma estrutura orientada a objetos, com herança, sobrescrita de métodos e organização das classes em pacotes (`package`), garantindo modularidade e organização dos arquivos.

## Funcionalidades
1. **Conta:** Classe base que contém os atributos número da conta, titular e saldo.
2. **ContaCorrente:** Subclasse que sobrescreve os métodos de saque e depósito, cobrando uma taxa de R$ 0,05 por operação.
3. **ContaPoupanca:** Subclasse que inclui o método `atualizarSaldo`, que ajusta o saldo com base em um percentual fornecido.
4. **ContaSalario:** Subclasse de `ContaCorrente` que cobra uma taxa diferenciada de R$ 0,01 por operação de saque e depósito.
5. **Transferências:** Permite transferências entre contas, aplicando as taxas corretas de acordo com o tipo de conta.
6. **Cadastro de Contas:** Simula o cadastro de diferentes tipos de contas e suas operações.

## Organização do Projeto
- As classes estão separadas em arquivos diferentes, todas dentro de um **package** para manter o código organizado e facilitar a manutenção. O uso de pacotes garante que todas as classes sejam acessíveis e organizadas dentro de um mesmo escopo, promovendo a reutilização e encapsulamento.

## Requisitos
- **Criar uma classe Conta:**
   - Atributos: número, titular, saldo.
   - Métodos: gets e sets para os atributos, além de `sacar`, `depositar` e `transferir`.

- **Subclasses:**
   - `ContaCorrente`: Taxa de R$ 0,05 por saque e depósito.
   - `ContaPoupanca`: Método `atualizarSaldo`, que recebe um percentual e atualiza o saldo.
   - `ContaSalario`: Taxa reduzida de R$ 0,01 por saque e depósito.

- **Operações:** Realize saques, depósitos e transferências entre contas, mostrando os saldos após cada operação.

## Exemplo de Uso
1. Criar contas do tipo `ContaCorrente`, `ContaPoupanca` e `ContaSalario`.
2. Configurar os dados das contas (número, titular, saldo inicial).
3. Executar operações de saque, depósito e transferência.
4. Para contas poupança, atualizar o saldo com base em um percentual.
5. Visualizar os saldos após cada operação.

## Como Executar
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seudominio/sistemabancario.git
   cd sistemabancario
   ```

2. **Compilar e executar o projeto no VS Code ou em outro ambiente Java.**
   Certifique-se de que todas as classes estão no mesmo **package** para que possam ser acessadas corretamente.

3. **Exemplo de inicialização de contas:**
   ```java
   ContaCorrente cc = new ContaCorrente(123, "João", 1000.00);
   ContaPoupanca cp = new ContaPoupanca(456, "Maria", 2000.00);

   cc.depositar(100);
   cp.sacar(200);
   cp.atualizarSaldo(5); // Atualiza o saldo com 5% de acréscimo
   ```

## Contribuições
Contribuições são bem-vindas! Para contribuir:
1. Fork o repositório.
2. Crie uma branch (`git checkout -b minha-feature`).
3. Commit suas alterações (`git commit -am 'Adiciona nova feature'`).
4. Faça push para a branch (`git push origin minha-feature`).
5. Abra um Pull Request.

## Licença
Este projeto é licenciado sob a licença MIT.
