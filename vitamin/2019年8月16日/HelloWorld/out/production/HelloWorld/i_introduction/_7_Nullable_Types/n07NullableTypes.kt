package i_introduction._7_Nullable_Types

import util.TODO
import util.doc7

fun test() {
    val s: String = "this variable cannot store null references"
    val q: String? = null

    if (q != null) q.length      // you have to check to dereference
    val i: Int? = q?.length      // null
    val j: Int = q?.length ?: 0  // 0
}

fun todoTask7(client: Client?, message: String?, mailer: Mailer): Nothing = TODO(
    """
        Task 7.
        Rewrite JavaCode7.sendMessageToClient in Kotlin, using only one 'if' expression.
        Declarations of Client, PersonalInfo and Mailer are given below.
    """,
    documentation = doc7(),
    references = { JavaCode7().sendMessageToClient(client, message, mailer) }
)
// 题目是只用一个if实现家javacode7的功能
fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    val email = client ?.personalInfo ?.email// 此行代码判断 client.personalInfo.email是否为空 加了非空安全调用
    if(email != null && message != null){// 再判断message是否为空
        mailer.sendMessage(email,message)// 输出调用程序
    }
    todoTask7(client, message, mailer)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}
