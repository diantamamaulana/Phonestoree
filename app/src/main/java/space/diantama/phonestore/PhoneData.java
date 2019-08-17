package space.diantama.phonestore;

import java.util.ArrayList;

public class PhoneData {

    public static String[][] data = new String[][] {
            {"Zenfone Max Pro m1","Rp.2.000.000","ZenFone Max Pro (M1) adalah generasi smartphone terbaru dengan platform Snapdragon 636 yang memiliki performa dan ketahanan yang maksimal yang bisa membawa Anda lebih jauh dari yang Anda pikirkan. Dengan layar Full View 6-inci Full HD+ (2160x1080) 18:9 yang memukau, baterai 5000mAh yang tahan lama, sistem dual kamera dan juga audio yang bombastis, ZenFone Max Pro memenuhi semua kebutuhkan Anda di keseharian yang padat. ZenFone Max Pro adalah pendamping yang setia bagi Anda, selalu siap saat dibutuhkan! ","https://www.asus.com/media/global/products/chh38KMyz3dz8W6M/P_setting_fff_1_90_end_500.png"},
            {"Zenfone Max Pro m2","Rp.2.300.000","ASUS menunjuk 12 toko pertama di seluruh Indonesia untuk melakukan penjualan perdana ZenFone Max Pro M2 yang akan digelar tangal 14 Desember 2018 pukul 10.00 WIB. Setiap pembelian ZenFone Max Pro M2 di 12 toko ini, pembeli akan mendapatkan power bank ZenPower Duo berkapasitas 10.000 mAh secara cuma-cuma.","https://i.gadgets360cdn.com/products/large/1543923025_635_asus_zenfone_max_pro_m2_winfuture.jpg"},
            {"Zenfone 5 Q","Rp.1.999.000","Zenfone 5Q adalah smartphone sempurna untuk pecinta foto! Baik foto pemandangan yang indah, atau foto-foto kebersamaan Anda, Zenfone 5Q akan membantu Anda mengabadikan nya. Sistem 4 kamera yang unik siap untuk menangkap momen beharga Anda.","https://www.asus.com/media/global/products/6t7ysxhhGeQsHX9U/P_setting_fff_1_90_end_600.png"},
            {"Zenfone 5 Z","Rp.6.636.000","Artificial Intelligence (AI) yang ada pada setiap unit ZenFone 5Z menjadikannya tidak hanya sekedar smartphone, tetapi juga pendamping Anda yang pintar, yang selalu ada untuk Anda. AI pada ZenFone 5Z membantu Anda untuk mengambil foto yang sempurna setiap saat dan apapun objeknya, tanpa harus berpikir. ZenFone 5Z selalu memberikan performa yang responsif terhadap apapun yang Anda lakukan. Dengan desain yang tipis dan tampilan yang memukau membuatnya terlihat sangat elegan. ZenFone 5Z adalah smartphone yang mencintai foto sebanyak yang Anda lakukan! ","https://www.static-src.com/wcsstore/Indraprastha/images/catalog/medium//85/MTA-2581114/asus_asus-zenfone-5z-zs620kl-smartphone--6gb--128gb--resmi-asus-indonesia-_full02.jpg"},
            {"Zenfone 6","Rp.9.985.000","Combining Asus inovation, leading-edge perfomance and sophistacated world class design, the new Zenfone6 defies ordinary. Its groundbreaking features include an all-screen NanoEdge display, the unique 48MP Flip Camera, and incredible battery life. Why choose ordinary, when there's Zenfone6?","https://gloimg.gbtcdn.com/soa/gb/pdm-product-pic/Electronic/2019/07/11/goods_img_big-v2/20190711104938_83343.jpg"},
            {"Huawei mate P30 Pro", "Rp.11,499.000","Your device has been tested in a controlled environment and certified to be splash, water, and dust resistant in specific situations (meets requirements of classification IP68 as described by the international standard IEC 60529). \n" +
                    "\n" +
                    "Water and dust-proofing are not permanent, and resistance may decrease as a result of normal wear over time. Do not charge the phone when it is wet or in moist environments. Refer to the manual for cleaning and drying instructions. Submersion in liquid and the resulting damage is not covered by the warranty.\n","https://erafone.com/media/catalog/product/cache/03d12820663c6564dc5cb71dcf0a1ef6/h/u/huawei-p30-pro-breathing-crystal_1.jpg"},
            {"Samsung note 10+", "Rp.17.179.000", "Introducing next-level power \\n\n" +
                    "With Galaxy Note10 and Note10+ we've designed a mobile experience that’s like a computer, a gaming console, a movie-tech camera, and an intelligent pen, all in one device.\n","https://ecs7.tokopedia.net/img/cache/700/product-1/2019/8/9/468852/468852_a54778da-9b84-4d69-98a1-b72c343b0937_720_720.jpg"}
    };

    public static ArrayList<Phone> getListData(){
        ArrayList<Phone> list = new ArrayList<>();
        for (String[] aData : data) {
            Phone phone = new Phone();
            phone.setName(aData[0]);
            phone.setHarga(aData[1]);
            phone.setDeskripsi(aData[2]);
            phone.setFoto(aData[3]);
            list.add(phone);
        }
        return list;
    }

}

