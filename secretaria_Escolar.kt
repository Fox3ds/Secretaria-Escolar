
class alunos(private var nome: String, private val matricula: Int, private var nota: FloatArray){

    public fun get_nome(){
        println("O nome do elemnto eh ${nome}");
    }
    public fun get_matricula(){
        println("A matricula do elemnto eh ${matricula}");
    }
    public fun get_media(){

        var media: Float = (nota[0]+nota[1]+nota[2]+nota[3])/4
        println("As notas do elemento são ${nota[0]}, ${nota[1]}, ${nota[2]}, ${nota[3]}\n E sua media é ${media}");

        if(media >= 7){
            println("parabens, aprovado")
        }else if(media>=4 && media<7){
            println("recuperação");
        }else{
            println("vai roda o burro")
        }
    }
    public fun adicionar_nota(){


        try {

            println("Qual nota voce quer mudar? 1, 2, 3 ou 4?")
            var i: Int = readLine()?.toInt() ?: 0;
            println("Qual será a nova nota?")
            var reserva: Float = nota[i-1]

            nota[i-1] = readLine()?.toFloat() ?: 0.0f;

            if(i>4 || nota[i-1]>10 || nota[i-1]<0)
            {

                nota[i-1]=reserva;
                throw IllegalArgumentException();

            }
        }catch (e: IllegalArgumentException) {
            println("erro ao digitar as notas")

        }


    }
}

fun main() {
    var aluno: alunos = alunos("Felipe", 19,  floatArrayOf(4.5f,5.0f,5.5f,9.0f));
    aluno.get_media();
    aluno.get_matricula();
    aluno.get_nome();

    aluno.adicionar_nota();
    aluno.get_media();


}