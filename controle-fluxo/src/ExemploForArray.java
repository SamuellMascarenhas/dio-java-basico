public class ExemploForArray {
    
    //em atrays o indice inicia em ZERO
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }    
}

// // ExemploFor.java for / each
// public class ExemploFor {
// public static void main(String[] args) {
// 	String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
//         //Forma abreviada
// 	for(String aluno : alunos) {
// 	  System.out.println(alunos);
// 	}

// }
// }