object Generator extends App {
  println(
    txt.vHostHttpToHttps(
      subDomain = "blog",
      mainDomain = "kuba86.com",
      redirectStatusCode = 301
    )
  )
}
