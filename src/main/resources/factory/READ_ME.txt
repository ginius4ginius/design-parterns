La fabrique permet de créer un objet selon un context bien défini (détermination du type d'objet par l'utilisateur
lors de l'éexecution de l'application). L'objet créé par le factory est toujouts de type de la classe mère (animal) mais
grâce au polymorphisme les traitements exécutés sont ceux de l'instance créé ( chat ou chien).

Raison de la présence d'une factorie :

- Le client ne peut déterminer le type d'objet à créer qu' à l'éxécution.
- Volonté de centraliser la création d'objets.

Il y a plusieurs formes d'implémentation de l'abstract factory:

- Classe factory unique qui attend les données nécessaires pour déterminer le type d'objet à instancier.
- Classe factory abstraite qui a ses sous classes par par instances à créer ( factoryChat, factoryChien).
Cette méythode permet de limiter la possibilité à l'utilisateur sur son choix d'instance (factory disponible) alors
qu'avec la première méthode une exception est à  gérer.

