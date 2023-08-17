package br.com.mateusdevelopes.teste

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform