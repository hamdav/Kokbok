[Vad är en databas?](https://www.guru99.com/introduction-to-database-sql.html)

[Hur gör man en MySQL-databas från command line](https://www.wikihow.com/Create-a-Table-in-MySQL)

[Java-mySQL interface (stack overflow)](https://stackoverflow.com/questions/2839321/connect-java-to-a-mysql-database)

Hur skall vi associera ingredienser med ett recept, jo genom en separat ingredienstable som länkas till en recept table enl [denna länk](https://stackoverflow.com/questions/17371639/how-to-store-arrays-in-mysql). 
Plan: 
* recepttable: tid, beskrivning, betyg osv
* Ingredienstable: ingrediensnamn, pris? annat?
* ingrediens_recepttable: recept_id, ingrediensnamn, mängd, mått?
