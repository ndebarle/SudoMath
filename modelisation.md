## Diagramme de classes

```mermaid
    classDiagram
    class GrilleSudoku
    GrilleSudoku : +int[81] numeros
    GrilleSudoku : +boolean[81] estDonne
    GrilleSudoku : +GrilleSudoku()
    GrilleSudoku : +EstSolvable()
    class SujetSudomath
    SujetSudomath : +String commentaire
    SujetSudomath : +Exercice[] exercices
    SujetSudomath : +Utilisateur auteur
    class Exercice
    Exercice : +String[] enonces
    Exercice : +String[] variables
    Exercice : +String[] reponses
    Exercice : +String niveau
    Exercice : +String theme
    SujetSudomath o-- Exercice
    SujetSudomath o-- ModeleLaTeX
    SujetSudomath o-- Utilisateur
    class Utilisateur
    Utilisateur : +int id
    Utilisateur : +String login
    Utilisateur : +String hashMotDePasse
    class ExemplaireSudomath
    ExemplaireSudomath o-- GrilleSudoku
    ExemplaireSudomath o-- SujetSudomath

```
