# Padrao-Projeto-Adapeter-GOF
Projeto reprodutor de vídeo - Ensinado pelo canal Cristiano Almeida - https://www.youtube.com/watch?v=Surp4lZaYF0

Intenção: Converter a interface de uma classe em outra interface, esperada pelos clientes. O Adapter permite que a classe com interfaces incompatíveis trabalhem em conjunto o que, de outra forma, seria impossível.

Aplicabilidade:
	Use o padrão Adapter quando:

	- Você quiser usar uma classe existente, mas sua interface não corresponder à interface que necessita;
	- Você quiser criar uma classe reutilizável que coopere com classes não relacionadas pu não previstas, ou seja, classes que não necessariamente tenham interfaces compatíveis;
	- (somente para adaptadores de objetos) você precisar usar várias subclasses existentes, porém, for impraticável adaptar essas interfaces criando subclassespara cada uma. Um adaptador de objeto pode adaptar a interface da sua classe-mãe.

#### Estrutura Adapter

![Estrutura Adapter](https://github.com/camimassaneiro/Padrao-Projeto-Adapeter-GOF/blob/master/Estrutura%20adapter.PNG)

Participantes:
	- Target: define a interface específica do domínio de Client usa.
	- Client: colabora com objetos compatíveis com a interface de Target.
	- Adaptee: define uma interface existente que necessita ser adaptada.
	- Adapter: adapta a interface do Adaptee à interface de Target.

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 
