fun main(){
    chars()
    zero(15 , 4)
    var s = agri("wanjiru", 1)
    println(s)
    place("nashville")


}
fun chars(){
    var v = "codeHive"
    var stmt = v[5].toString() + v[6] + v[7]
    println(stmt)

}
fun zero(x:Int,y:Int){
    var m = x%y
    println(m)

}
fun agri(p:String, z:Int): String{
    var sent = "Hi,my name is $p and i am $z years old."
    return sent
}
fun place(x:String){
    var p = x.length
    println(p)
}