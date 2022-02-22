public class Principal {
    public static void main(String[] args){

        Empregado empregado = new Empregado();
        empregado.setNome("Carla");
        empregado.setEndereco("Marília");
        empregado.setTelefone("14983624644");
        empregado.setSalario(1800);
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());

        Empregado empregado2=new Empregado();
        empregado2.setNome("João");
        empregado2.setEndereco("Pompeia");
        empregado2.setTelefone("1456577342");
        empregado2.setSalario(15000);
        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getEndereco());
        System.out.println(empregado2.getTelefone());
        System.out.println(empregado2.getSalario());
    }
}
