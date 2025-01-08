# 🚀 N11 Selenium Test Otomasyonu Projesi

Bu kod, **Selenium** ve **TestNG** kullanılarak bir e-ticaret sitesi (**n11.com**) üzerinde temel bir test otomasyonu senaryosu gerçekleştirmek amacıyla yazılmıştır.  
Amacı, bir ürün arama, sonuçları görüntüleme ve sepete ekleme işlemlerinin otomatik olarak doğrulanmasını sağlamaktır.

---

## 📚 Kodun Amacı ve Akışı

### 1️⃣ **TabBarPage (Sayfa Üst Çubuğu Testi)**  
**Amaç:** Arama kutusunu kullanarak belirli bir ürünü aramak ve sepetteki ürün sayısını kontrol etmek.  

**Metotlar:**  
- `search(String searchWord)` → Arama kutusuna kelimeyi yazıp "Enter" tuşuna basar.  
- `getBasketTotalNumber()` → Sepetteki toplam ürün sayısını döner.  

---

### 2️⃣ **ResultPage (Arama Sonuçları Sayfası Testi)**  
**Amaç:** Arama sonuçlarını kontrol etmek ve ilk ürüne tıklamak.  

**Metotlar:**  
- `getResultText()` → Arama sonuçlarının görüntülenip görüntülenmediğini kontrol eder.  
- `clickToFirstProduct()` → İlk ürünün bağlantısına tıklar.  

---

### 3️⃣ **ProductDetailPage (Ürün Detay Sayfası Testi)**  
**Amaç:** Ürünü sepete eklemek.  

**Metotlar:**  
- `clickAddToCart()` → "Sepete Ekle" butonuna tıklar.  

---

### 4️⃣ **BaseTest (Temel Test Ayarları)**  
**Amaç:** Testlerin çalışacağı tarayıcıyı yapılandırmak ve genel test kurulumunu sağlamak.  

**Metotlar:**  
- `setUp()` → Tarayıcıyı başlatır ve yapılandırır.  
- `tearDown()` → Tarayıcıyı kapatır ve tüm doğrulamaları kontrol eder (`assertAll`).  

---

### 5️⃣ **N11Test (Test Senaryolarının Çalıştırıldığı Sınıf)**  
**Amaç:** Test senaryolarını sırasıyla çalıştırmak.  

**Test Metotları:**  
- `searchTest` → `TabBarPage` kullanarak "Laptop" araması yapar.  
- `resultPageTest` → `ResultPage` kullanarak arama sonuçlarının görüntülendiğini doğrular ve ilk ürüne tıklar.  
- `addToCartTest` → `ProductDetailPage` kullanarak ürünü sepete ekler ve sepetteki ürün sayısının doğru olduğunu kontrol eder.  

---

## 🛠️ **Özet Akış:**  
1️⃣ **Arama Yap:** Kullanıcı, arama kutusuna "Laptop" yazar ve arar.  
2️⃣ **Sonuçları Kontrol Et:** Arama sonuçlarının doğru bir şekilde geldiği doğrulanır ve ilk ürüne tıklanır.  
3️⃣ **Ürünü Sepete Ekle:** Ürün sepete eklenir ve sepetteki ürün sayısının doğru olduğu doğrulanır.  

---

✅ **Teknolojiler:** Selenium, TestNG, Java  
📄 **Test Araçları:** IntelliJ IDEA, ChromeDriver  
🧪 **Test Türü:** UI Test Otomasyonu  
