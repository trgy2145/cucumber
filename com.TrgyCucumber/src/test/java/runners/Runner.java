package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)
public class Runner {
    /*
    cucumber da Runner class ı bos bir classtır.
    Runner classını diğer classlardan farklı kılan ve TestNG deki xml dosyları gibi
    calısmasını saglayan iki adet notasyon vardır.

    @Runwith notasyonu projemize cucumber junit dependency eklememizin sebebidir
    bu sayede runner classlarımız cucumber ile calısır.

    @cucumberoptions notasyonu ile istediğimiz özellikleri runner classına ekleyebiliriz
    Raporlama gibi ekstra optionları da ileride ekleyeceğiz
    ancak
    öncelikle görevi features dosyaları ile stepdefinitions da bulunan java methodlarını ilişkilendirmektir.

    sonra features yolunu göster (path from content)
    ve step definitons yolunu göster onu glue yaz aynı sekilde eğer öyle calısmazsa
    dosya yoluna sadece stepdefinitions yazabilirsin.

    tags (wip =work in progress) : features klasörü icinde yazılan tüm tag(ları) aratıp buldugu tüm feature
    veya scenarioları calıstırır.

    dryRun = iki değer alabilir
    true= verilen tag ile secili olan feature veya scnerio daki eksik
    stepdefinitionsları bulup ilgili methodları olusturur.
    hicbir sekilde testımızı calısstırmaz ,eksik adım yoksa test passed olarak işaretlenir..

    false : verilen tag ile işaretlenen feature veya senaryoları calıstırır..önce true yap eksikleri bul sonra
    false yap test calıstır.
     */
}
