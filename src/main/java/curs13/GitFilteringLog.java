package curs13;

public class GitFilteringLog {
	
	//filtering the log
	
	//git log -> show all log history
	//git log --oneline-> full log truncated to one line
	//git log --oneline --all> full log truncated to one line for all
	//git log--online -4: arata ultimele 4 commits - posibilitatea sa filtrez dupa un anumit nr de commits: 
	//git log -2 -> ultimele 2 comits cu full details
	//git log -1 -> ultimul comit cu full details

	
	// git log --oneline -2 -> filter by number
	
	// git log --oneline --after='2023-06-01'     - data comitului este foarte utila. Daca vreau sa stiu data comitului de la o anumita data sau
	// git log --oneline --before='2023-06-01'
	
	// git log -1 sau git log --author=' name commit author' -> filtrarea dupa autor : 
	// git log --oneline --grep=' commit message' -> filtrare dupa commit message : 
	// git log --oneline --stat -> comanda care ne arata toate fisierele care au fost modificate
	// git log --oneline --patch -> all lines changed
}
