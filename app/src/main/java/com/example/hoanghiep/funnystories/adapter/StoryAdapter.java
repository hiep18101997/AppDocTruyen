package com.example.hoanghiep.funnystories.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hoanghiep.funnystories.R;
import com.example.hoanghiep.funnystories.activity.ViewPagerActivity;
import com.example.hoanghiep.funnystories.item.ItemStory;

import java.util.ArrayList;

/**
 * Created by Hoang Hiep on 1/15/2017.
 */

public class StoryAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private ArrayList<ItemStory> stories;
    private int id;

    public StoryAdapter(Context context, int id) {
        mContext = context;
        this.id = id;
        initData();
    }

    private void initData() {
        stories = new ArrayList<>();
        switch (id) {
            case 1:
                stories.add(new ItemStory("Trí nhớ siêu khủng của sếp!", "Hai nhân viên nói chuyện với nhau:\n" +
                        "Người A: Sếp của tớ có trí nhớ siêu ghê… Năm vừa rồi tớ lỡ đi muộn có 2 lần thôi mà kỳ họp cơ quan nào ông ấy cũng điểm danh.\n" +
                        "\n" +
                        "Người B: Chưa bằng sếp cũ của tớ. Tớ chuyển cơ quan đó 5 năm rồi, lại thay đổi chỗ ở đến ba lần, vậy mà hồi cưới vợ cho con, ông ấy vẫn tìm đến được tận của nhà tớ để đưa thiệp mời.", 1));
                stories.add(new ItemStory("Trong rạp chiếu phim…", "– Chuyện cậu và anh chàng nhà giàu mới quen đến đâu rồi?\n" +
                        "\n" +
                        "– Thôi rồi.\n" +
                        "\n" +
                        "– Sao vậy? Hôm qua hai người còn đi xem phim với nhau mừ.\n" +
                        "\n" +
                        "– Ừ, nhưng lúc trong rạp mất điện, chân anh ta cứ quờ quạng mãi…\n" +
                        "\n" +
                        "– Anh ta sàm sỡ cậu hả?\n" +
                        "\n" +
                        "– Được thế thì tốt. Đằng này, anh ta cứ quờ quạng sợ mất đôi dép tổ ong cũ rích.", 2));
                stories.add(new ItemStory("Lý do ế dài dài", "Lý do ế:\n" +
                        "Thứ 1 : Xinh nhưng chảnh nên không thằng nào dám vác dái đến tán\n" +
                        "\n" +
                        "Thứ 2 : Đàn ông bọn em thấy mấy đứa xinh xinh, ngon ngon thì chỉ trêu ghẹo cho vui thôi, chứ trong đầu lúc nào chả nghĩ các em ý có người yêu rồi, nên cũng chả muốn tán.\n" +
                        "\n" +
                        "Thứ 3 : Các chị đã xinh đã ngon lại còn giàu có, thì bố con thằng nào mà dám trèo cao, tán được thì chớ, chứ tán không được thì lại bảo “Tiền ít mà đòi hít *** thơm”, không biết tự lượng sức mình\n" +
                        "\n" +
                        "Thứ 4 : Được người ta thích rồi nhưng các chị không chịu nhận lời, còn làm trò kiêu sa kéo dài thời gian nọ kia, đến lúc nó chán rồi nó đi tán đứa khác thì lại than thân trách phận\n" +
                        "\n" +
                        "Thứ 5 : Nhiều chị cứ thích nồi nào úp vung nấy, kén cá chọn canh, trai nghèo thì chê mà trai giàu thì lê lết đi theo, trong khi nó lại đéo thích các chị, thế thì ngồi đấy mà chờ với chả đợi nhé\n" +
                        "\n" +
                        "Thứ 6 : Yêu đứa này rồi nhưng vẫn đi chơi với đứa khác để tỏ vẻ mình được nhiều trai theo đuổi, bám đít… Mang cái tiếng lăng nhăng nên chả thằng nào dám yêu\n" +
                        "\n" +
                        "Thứ 7 : Các chị lúc nào cũng muốn trâu đi tìm cọc, lòng nọc đi tìm bướm đêm, chứ chả bao giờ các chị chủ động tỏ tình tán tỉnh.", 3));
                stories.add(new ItemStory("Con đâu phải đứa ngu?", "Na đi học về hớn hở bảo mẹ, mẹ ơi, hôm nay con kiếm được 20.000 đồng nhé!\n" +
                        "\n" +
                        "– Ở đâu ra thế con?\n" +
                        "\n" +
                        "– Thằng Tèo đố con trèo lên cây, mỗi lần nó cho 1.000 đồng.\n" +
                        "\n" +
                        "– Mày bị nó lừa rồi, nó làm thế để nhìn quần sịp của mày đấy.\n" +
                        "\n" +
                        "– Hihi.., con biết rồi, con đâu phải đứa ngu? Cho nên hôm nay con đâu có mặc quần sịp!!!\n" +
                        "\n" +
                        ":))", 4));
                stories.add(new ItemStory("Thế mới là phụ nữ", "Một cô gái bước vào bưu điện xin mấy tờ mẫu để gửi điện tín. Cô viết xong bức thư thứ nhất, đọc lại rồi xé đi, viết bức thứ hai rồi lại xé.\n" +
                        "\n" +
                        "Cuối cùng, khi đã viết xong bức thứ 3, cô đưa cho nhân viên bưu điện yêu cầu đánh điện khẩn.\n" +
                        "\n" +
                        "Khi bức điện đánh xong và cô gái đã ra về, nhân viên bưu điện tò mò giở lại 2 bức điện đã xé và đọc.\n" +
                        "\n" +
                        "Bức thứ nhất: “Tất cả đã hết. Em không muốn thấy mặt anh nữa!”\n" +
                        "\n" +
                        "Bức thứ hai: “Đừng viết cho em và đừng tìm gặp em nữa!”\n" +
                        "\n" +
                        "Còn nội dung bức gửi đi là: “Hãy đến ngay với em! Mong anh!”", 5));
                stories.add(new ItemStory("Ai lừa ai", "Chàng cố gắng thuyết phục nàng uống một ly rượu nhưng nàng lại từ chối thẳng thừng, và thậm chí nàng còn khẳng định chưa bao giờ động tới một giọt trong đời. Cuối cùng, chàng thắp nến, mở nhạc êm dịu và mời nàng cố thử một giọt Scotch. Nàng nhấp một ngụm nhỏ và nhổ ra tức thì.\n" +
                        "\n" +
                        "Chàng hỏi:\n" +
                        "\n" +
                        "– Em không thích mùi vị của nó à?\n" +
                        "\n" +
                        "Nàng bực tức:\n" +
                        "\n" +
                        "– Không, tất nhiên. Anh nói là rượu Scotch mà lại lừa tôi bằng Whisky trộn với một loại rẻ tiền khác.\n" +
                        "\n" +
                        "!!???", 6));
                stories.add(new ItemStory("Quà Giáng Sinh", "Khi ông già Noel đang đi dạo trong một trung tâm mua sắm thì bỗng có một cô gái xinh đẹp chạy nhanh đến nắm tay ông.\n" +
                        "Cô gái nói:\n" +
                        "\n" +
                        "– Ôi, có phải ông chính là ông già Noel không? Sắp tới Giáng sinh rồi, tôi cũng rất muốn được nhận quà. Ông có thể cho tôi một điều ước không?\n" +
                        "\n" +
                        "Ông già Noel suy nghĩ một chút vì trước giờ ông chỉ trao quà cho trẻ nhỏ, không thực hiện điều ước cho người lớn. Tuy nhiên, ông ta vẫn nhã nhặn đáp:\n" +
                        "\n" +
                        "– Được, thế cô muốn quà Giáng sinh gì?\n" +
                        "\n" +
                        "Cô gái nũng nịu đáp:\n" +
                        "\n" +
                        "– Tôi thì không cần quà lắm, nhưng ông có thể tặng mẹ tôi một món quà được không?\n" +
                        "\n" +
                        "– Tặng quà cho mẹ, cô thật là một người con ngoan, và rất chu đáo – không cần nghĩ ngợi, ông già Noel mỉm cười nói tiếp. Vậy cô muốn tặng quà gì cho mẹ?\n" +
                        "\n" +
                        "– Dạ. Tặng bà đấy một người con rể được không?\n" +
                        "\n" +
                        "– !?!", 7));
                stories.add(new ItemStory("Tôi không thấy gì", "Trong một cuộc gặp mặt giữa ba phụ nữ Việt Nam, Trung Quốc và Mỹ.\n" +
                        "\n" +
                        "Người phụ nữ Mỹ nói:\n" +
                        "\n" +
                        "* Tôi đã nói chồng giặt đồ.\n" +
                        "\n" +
                        "– Ngày thứ nhất tôi không thấy gì…\n" +
                        "\n" +
                        "– Ngày thứ hai tôi không thấy gì…\n" +
                        "\n" +
                        "– Và đến ngày thứ ba thì anh ấy không những giặt đồ cho mình mà còn giặt đồ cho cả tôi nữa.\n" +
                        "\n" +
                        "Người phụ nữ Trung quốc nói:\n" +
                        "\n" +
                        "* Tôi đã bảo chồng tôi nấu ăn.\n" +
                        "\n" +
                        "– Ngày thứ nhất tôi không thấy gì…\n" +
                        "\n" +
                        "– Ngày thứ hai tôi không thấy gì…\n" +
                        "\n" +
                        "– Và đến ngày thứ ba thì anh ấy đã vào bếp.\n" +
                        "\n" +
                        "Đến người phụ nữ Việt Nam nói:\n" +
                        "\n" +
                        "* Tôi đã bảo chồng rửa bát….\n" +
                        "\n" +
                        "– Ngày thứ nhất tôi không thấy gì…\n" +
                        "\n" +
                        "– Ngày thứ hai tôi không thấy gì…\n" +
                        "\n" +
                        "– Và đến ngày thứ ba thì…\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        "…….mắt tôi đã bớt sưng và nhìn được bình thường.", 8));
                stories.add(new ItemStory("Người đẹp tưởng bở", "Cô nhận thấy anh thường đến vào các buổi tối và cuối tuần. Anh ta không làm bất kỳ điều gì để bắt chuyện hoặc gây chú ý đến cô, đôi khi anh lén lút nhìn cô rồi giả vờ cúi xuống nhìn điện thoại.\n" +
                        "\n" +
                        "Cứ thế một năm trôi qua, Jada hiểu rằng anh chàng kia thầm thích mình nhưng có vẻ anh quá nhút nhát để thổ lộ. Vì thế Jada quyết định chủ động làm quen. Ngày hôm sau, Jada tiến đến và nói:\n" +
                        "\n" +
                        "– Chào anh, em là Jada!\n" +
                        "\n" +
                        "Chàng trai hơi giật mình:\n" +
                        "\n" +
                        "– Chào em, anh tên Smith!\n" +
                        "\n" +
                        "– Em đánh giá rất cao sự kiên nhẫn và nghiêm túc của anh. Một năm qua tối nào anh cũng đến trước của nhà em, em biết là anh thầm thích em nhưng lại quá nhút nhát để thổ lộ. Em muốn nói là em thật sự cũng rất thích anh đấy!\n" +
                        "\n" +
                        "Chàng trai nhìn cô mỉm cười rồi nói:\n" +
                        "\n" +
                        "Ôi, thật xin lỗi em, Jada! Sự thật là wifi nhà em không có mật khẩu, nên sau giờ làm việc anh đến đây xài miễn phí để nhắn tin với bạn gái ấy mà!\n" +
                        "\n" +
                        "– !!!", 9));
                stories.add(new ItemStory("Bao giờ mới có chồng", "Một phụ nữ đến gặp thầy bói hoạnh họe sau khi xem quẻ 6 năm về trước.\n" +
                        "\n" +
                        "– Cách đây 6 năm ông bảo tôi sẽ có chồng và 6 con, đúng vậy không?\n" +
                        "\n" +
                        "– À… Ờ… Lá số của cô nói lên như vậy mà.\n" +
                        "\n" +
                        "– Đúng là tôi đã có 6 đứa con, nhưng tôi hỏi ông: Phải chờ đến bao giờ mới có chồng đây? – !?", 10));
                stories.add(new ItemStory("Bí quyết trị chồng hư hay nhất", "Cô gái vì bị người chồng đối xử tệ bạc liền về khóc lóc với mẹ:\n" +
                        "\n" +
                        "– Con không thể chịu đựng được anh ta nữa rồi mẹ ạ.\n" +
                        "\n" +
                        "Bà mẹ khuyên:\n" +
                        "\n" +
                        "– Con bình tĩnh đi. Có chuyện gì thì hai vợ chồng từ từ giải quyết.\n" +
                        "\n" +
                        "– Lần này con quyết định sẽ cho anh ta một bài học.\n" +
                        "\n" +
                        "– Thế con định làm thế nào?\n" +
                        "\n" +
                        "– Con sẽ bỏ anh ta về sống với mẹ.\n" +
                        "\n" +
                        "Bà mẹ thốt lên:\n" +
                        "\n" +
                        "– Ôi đứa con gái thơ dại của tôi! Nếu con thật sự muốn trị được chồng con thì hãy trở về nhà và đưa mẹ theo về sống cùng với vợ chồng con.\n" +
                        "\n" +
                        "– ?!!", 11));
                stories.add(new ItemStory("Truyện cười: Tưởng bở", "Chàng trai và cô gái đang ngồi buôn điện thoại với nhau. Cô gái hỏi: “Chiều nay anh có bận gì không?”.\n" +
                        "\n" +
                        "– Anh bận đi chơi rồi.\n" +
                        "\n" +
                        "– Với ai?\n" +
                        "\n" +
                        "– Với cô gái đẹp nhất trên thế giới.\n" +
                        "\n" +
                        "Cô gái vốn thích chàng trai nên rất buồn rầu. Chiều tới, tiếng chuông cửa nhà cô gái bỗng đổ liên hồi. Khi cô ra mở cửa, chàng trai đã đứng đó với bó hoa hồng đỏ trên tay.\n" +
                        "\n" +
                        "– Chào em.\n" +
                        "\n" +
                        "– Anh làm gì ở đây thế?\n" +
                        "\n" +
                        "– Thì anh đã bảo sẽ đi chơi với cô gái đẹp nhất trên thế giới mà.\n" +
                        "\n" +
                        "– Hi hi, anh này… làm em ngại quá…\n" +
                        "\n" +
                        "– Thế chị gái em có nhà không?", 12));
                stories.add(new ItemStory("Tranh vui: Có phải chỉ vì béo đâu!", "tydtyrwstrdyet5re3w5easews", 13));
                stories.add(new ItemStory("Nhìn xem thí chủ đang đứng ở đâu", "Có một cô gái từ khi sinh ra đã đen đúa, xấu xí nên thường xuyên bị trêu chọc. Một hôm cô đến chùa xin lời khuyên:\n" +
                        "\n" +
                        "– Thưa đại sư, từ nhỏ con đã rất đen, lớn lên vẫn thế, về mùa hè lại càng đen hơn nên thường xuyên bị mọi người chế giếu. Con rất buồn, con không biết phải làm sao.\n" +
                        "\n" +
                        "Vị đại sư không nói gì, chỉ lặng lẽ ra đẩy cánh cửa chùa cho ánh sáng tràn vào căn phòng.\n" +
                        "\n" +
                        "Cô gái nói tiếp:\n" +
                        "\n" +
                        "– Con hiểu rồi thưa đại sư, đại sư muốn con mở rộng cửa trái tim, cứ sống vui vẻ mà không cần quan tâm đến lời nói của người khác đúng không?\n" +
                        "\n" +
                        "– À không, lão nạp chỉ muốn nhìn cho rõ rốt cuộc thí chủ đang đứng ở đâu thôi.", 14));
                stories.add(new ItemStory("Những định nghĩa về chồng", "Nhà nữ triết học khẳng định: “Chồng là một dạng vật chất, nó không bao giờ bị mất đi, chỉ chuyển từ ‘người’ này sang ‘người’ khác”.\n" +
                        "\n" +
                        "Nhà nữ vật lý học thì nói: “Chồng chịu ảnh hưởng rất lớn của lực ‘vạn vật hấp dẫn’, khi xa thì hút khi gần thì đẩy”.\n" +
                        "\n" +
                        "Cô nhân viên y tế thì cảnh báo: “Chồng là một loại vi khuẩn hay ‘lờn thuốc’, rất khó trị”.\n" +
                        "\n" +
                        "Cô nhân viên ngân hàng thì than vãn: “Chồng là chuyên gia vay nóng, nhưng khả năng chi trả thì không có”.\n" +
                        "\n" +
                        "Chị nông dân thì thú nhận: “Chồng là ‘lúa giống’, nếu ta không tranh thủ ‘sạ’ hết ở ruộng mình, có nguy cơ bị chị hàng xóm mượn giống”", 15));
                stories.add(new ItemStory("Bị làm nhục", "Cô gái nói với quan tòa:\n" +
                        "\n" +
                        "– Hôm qua anh ấy đến nhà tôi chơi .\n" +
                        "\n" +
                        "Đang ngồi chơi thì anh ấy đè tôi xuống , cởi hết đồ tôi ra rồi …\n" +
                        "\n" +
                        "Tòa án: Rồi sao nữa ?\n" +
                        "\n" +
                        "– Rồi anh ấy đã vội bỏ đi ạ .\n" +
                        "\n" +
                        "– Vậy tại sao lại bảo anh ấy làm nhục cô ?\n" +
                        "\n" +
                        "– Khi anh ấy nhìn thấy cơ thể trần truồng như nhộng của tôi mà anh ấy lại bỏ đi thì khác nào làm nhục tôi chứ.", 16));
                stories.add(new ItemStory("Mồi câu ế…", "Ông bố hỏi cô con gái:\n" +
                        "\n" +
                        "– Con yêu, sao con chưa chịu lấy chồng?\n" +
                        "\n" +
                        "– Bố ơi, con đã tìm hiểu mấy chàng trai nhưng chưa vừa ý ai cả, phải chọn lựa kỹ càng bởi đó là quyết định quan trọng cả cuộc đời bố ạ!\n" +
                        "\n" +
                        "– Nhưng con không còn trẻ nữa, con cần phải biết nắm thời cơ.\n" +
                        "\n" +
                        "– Bố yên tâm, trong biển cả cuộc đời, cá nhiều vô số mà.\n" +
                        "\n" +
                        "– Nhưng con ơi, mồi câu mà để lâu ngày sẽ\n" +
                        "\n" +
                        ".\n" +
                        "\n" +
                        ".\n" +
                        "\n" +
                        ".\n" +
                        "\n" +
                        ".\n" +
                        "\n" +
                        "bốc mùi đó…", 17));
                stories.add(new ItemStory("Mẹ ơi! Con đã có thai", "Cô con gái chạy vào phòng nói với mẹ: Mẹ ơi! Con đã có thai!\n" +
                        "\n" +
                        "Bà mẹ sửng sốt: \n" +
                        "\n" +
                        "– Thằng nào, thằng nào hả? Gọi ngay nó tới đây tao bảo!…\n" +
                        "\n" +
                        "20 phút sau khi cô con gái gọi điện thì một chiếc xe sang trọng mui trần màu đen đậu ngay trước cửa, một chàng thanh niên bảnh bao bước ra từ trong xe.\n" +
                        "\n" +
                        "– Nếu con gái bà sinh con trai thì sẽ được thừa kế một khu resort và 10 triệu đô la trong tài khoản, còn nếu sinh con gái thì sẽ được 2 cửa hàng thời trang và 5 triệu đô la trong tài khoản, tuy nhiên nếu bị sẩy thai thì…\n" +
                        "\n" +
                        "Bà mẹ ngay lập tức ngắt lời:\n" +
                        "\n" +
                        "– Thì cậu phải làm cho nó có thai tiếp.", 18));
                stories.add(new ItemStory("Truyện cười đúng nghề", "Buổi tối trên đường vắng, 2 nữ sinh đang đi cùng nhau, một người đang học ngành toán còn người kia học ngành vật lý, thấy có tiếng động lạ phía sau.\n" +
                        "\n" +
                        "Nàng nữ sinh toán nói:\n" +
                        "\n" +
                        "– Tính trọng âm của tiếng động thì sau chỉ 20 giây là hắn đuổi kịp chúng ta. Theo xác suất 50/50, chúng ta chia làm 2 ngả để chạy thì ít nhất cũng có một người thoát.\n" +
                        "\n" +
                        "Lúc sau, cả 2 đều an toàn về tới phòng trọ. Nữ sinh vật lý kể:\n" +
                        "\n" +
                        "– Đúng như cậu tính, 20 giây, hắn đã đuổi sát mình. Theo định luật vạn vật hấp dẫn thì người kéo váy lên chạy hắn sẽ đuổi, còn theo định luật Newton do hắn tụt quần xuống lên chạy chậm và đã không đuổi kịp mình.", 19));
                stories.add(new ItemStory("Thơ chế lý mười thương hài :v", "Một thương đôi má của nàng\n" +
                        "\n" +
                        "Xoa toàn mỹ phẩm anh tàn tháng lương.\n" +
                        "\n" +
                        "Hai thương giọng ngọt như đường,\n" +
                        "\n" +
                        "Nàng xin một tiếng vua nhường mất ngôi.\n" +
                        "\n" +
                        "Ba thương đo đỏ đôi môi,\n" +
                        "\n" +
                        "Anh không chạm đươc sợ trôi son nàng.\n" +
                        "\n" +
                        "Bốn thương mười ngón thiên đàng,\n" +
                        "\n" +
                        "Móng nàng lạ lắm, lúc vàng lúc xanh.\n" +
                        "\n" +
                        "Năm thương đôi mắt long lanh,\n" +
                        "\n" +
                        "Liếc tình cọp cũng biến thành nai tơ.\n" +
                        "\n" +
                        "Sáu thương cái nết ngây thơ,\n" +
                        "\n" +
                        "Quen nàng một tháng anh khờ ba năm.\n" +
                        "\n" +
                        "Bảy thương cái mặt chằm dằm,\n" +
                        "\n" +
                        "Đòi mua một cái áo đầm mới vui.\n" +
                        "\n" +
                        "Tám thương mái tóc buông xuôi,\n" +
                        "\n" +
                        "Làm anh điêu đứng bởi mùi dầu thơm.\n" +
                        "\n" +
                        "Chín thương nàng biết nấu cơm,\n" +
                        "\n" +
                        "Ba năm một món anh còm như ma\n" +
                        "\n" +
                        "Mười thương tính chẳng xa hoa,\n" +
                        "\n" +
                        "Vòng vàng không thích, chỉ mê hoạt xoàn\n" +
                        "\n" +
                        "Làm trai sao quá ê chề\n" +
                        "\n" +
                        "Thương xong mười cái về quê chăn bò!", 20));
                break;
            case 2:
                stories.add(new ItemStory("Bố con thi tán gái !", "Một ông bố nọ suốt ngày than vãn với thằng con trai:\n" +
                        "\n" +
                        "– Mày ngần này tuổi rồi mà tau chẳng thấy mày có được nổi một con bồ! thằng này kém quá thôi! không bằng bố mày ngày xưa!\n" +
                        "\n" +
                        "Thằng con bực bội gân cổ lên : Bố có giỏi thì ra đường tán thử xem, con với bố đi ra ngoài đường, thi xem ai tán được cô gái nào trước?\n" +
                        "\n" +
                        "Bố: Đi thì đi chứ, tao sợ gì!\n" +
                        "\n" +
                        "Hai bố con ra đầu ngõ! Thấy 1 cô bé rất xinh đi xe đạp ngang qua, cậu con trai tán tỉnh:\n" +
                        "\n" +
                        "– “Em ơi em xin đẹp quá em … có yêu anh không?”\n" +
                        "\n" +
                        "Gặp đúng cô đanh đá, chua ngoa, cô này quay đầu chửi lại :\n" +
                        "\n" +
                        "– Yêu yêu cái thằng bố mày ấy!\n" +
                        "\n" +
                        "Ông bố nhảy cẫng hét lên: Đấy đấy … thấy chưa? mày thua nha con!\n" +
                        "\n" +
                        "…\n" +
                        "\n" +
                        "…….\n" +
                        "\n" +
                        "………….", 1));
                stories.add(new ItemStory("Tưởng bay được", "Sau buổi liên hoan cuối năm, một anh chàng tỉnh dậy và thấy mình nằm trong bệnh viện, tay chân băng bó trắng toát và xung quanh là những ‘chiến hữu’ quen thuộc.\n" +
                        "\n" +
                        "– Sao tớ lại ở đây?\n" +
                        "\n" +
                        "– Hôm qua, đang uống cậu bỗng đứng dậy, cởi áo ra và bảo rằng: ‘Tớ sẽ bay như chim cho mà xem!’.\n" +
                        "\n" +
                        "– Rồi sao nữa?\n" +
                        "\n" +
                        "– Cậu leo lên cửa sổ và nhảy xuống…\n" +
                        "\n" +
                        "– Sao không ngăn tớ lại?\n" +
                        "\n" +
                        "– Vì ai cũng nghĩ cậu bay được thật!", 2));
                stories.add(new ItemStory("Cái kết bất ngờ", "Nhân dịp nghỉ hè, Robert và Raymond cùng nhau đi leo núi. Khi họ đến nơi thì xảy ra một cơn bão, hai người đành tìm chỗ trú tại một biệt thự lớn. Chủ nhân ngôi nhà, một phụ nữ xinh đẹp, nói rằng họ chỉ có thể qua đêm trong nhà kho ngoài vườn, vì cô đang chịu tang chồng. Chín tháng sau, Robert gọi điện cho Raymond:\n" +
                        "\n" +
                        "– Raymond này, anh có còn nhớ cái đêm mà chúng ta buộc phải ngủ trong nhà kho không?\n" +
                        "\n" +
                        "– Nhớ, rồi sao?\n" +
                        "\n" +
                        "– Anh có còn nhớ nữ chủ nhân xinh đẹp của tòa biệt thự lớn?\n" +
                        "\n" +
                        "– Nhớ chứ…\n" +
                        "\n" +
                        "– Anh có còn nhờ là đêm hôm đó, khi tôi đang ngủ thì anh lén đột nhập vào phòng cô ấy không?\n" +
                        "\n" +
                        "– Nhớ… Raymond hạ giọng lo lắng.\n" +
                        "\n" +
                        "– Để tránh tai tiếng, anh đã lấy tên và địa chỉ của tôi để tự giới thiệu với cô ấy?\n" +
                        "\n" +
                        "– Có lẽ… mình nên xin lỗi cậu. Đầu dây bên kia ngập ngừng.\n" +
                        "\n" +
                        "– Không, tôi phải cảm ơn anh, vì cô ấy vừa từ trần và để lại cho tôi tòa nhà cùng 10 triệu đôla!\n" +
                        "\n" +
                        "– !!!", 3));
                stories.add(new ItemStory("Mặc nhầm quần", "Hai người bạn thân ở chung phòng trọ rảnh rỗi ngồi nói chuyện với nhau.\n" +
                        "\n" +
                        "– Hôm qua tao vừa rủ bé đi chơi mà trong túi không có đồng nào. Nhưng cuối cùng tao vẫn quyết định cứ rủ.\n" +
                        "\n" +
                        "Người bạn kia hứng chí, vỗ đùi cái đét bảo:\n" +
                        "\n" +
                        "– Mày thật là có chí khí!\n" +
                        "\n" +
                        "– Khi đi, tao mới phát hiện ra trong túi có rất nhiều tiền, thế là hai đứa tao xài hết số tiền đó.\n" +
                        "\n" +
                        "– Đúng là trời không phụ lòng người tốt mà.\n" +
                        "\n" +
                        "– Uh, nhưng khi về tao mới phát hiện ra… tao lỡ mặc nhầm quần của mày.", 4));
                stories.add(new ItemStory("Chiếc máy gây ấn tượng phụ nữ", "Một chàng trai trẻ bước vào phòng tập gym, anh tiến lại gần huấn luyện viên và hỏi:\n" +
                        "\n" +
                        "– Tôi muốn gây ấn tượng với một cô gái xinh đẹp. Vậy tôi nên tập với loại máy nào là thích hợp nhất.\n" +
                        "\n" +
                        "Vị huấn luyện viên nhìn anh ta mỉm cười đáp:\n" +
                        "\n" +
                        "– Máy ATM trước cửa phòng tập thưa anh.\n" +
                        "\n" +
                        "– !!!", 5));
                stories.add(new ItemStory("Bí mật", "Sau một hồi nhậu nhẹt, có người đề nghị mỗi người phải thú nhận một điều gì đó mà mình chưa bao giờ nói với ai.\n" +
                        "\n" +
                        "Người thứ nhất:\n" +
                        "\n" +
                        "– Được thôi! Tôi chưa bao giờ nói với ai rằng tôi là một người đồng tính cả.\n" +
                        "\n" +
                        "Người thứ hai:\n" +
                        "\n" +
                        "– Tôi đã có quan hệ tình cảm với bà xã của sếp!\n" +
                        "\n" +
                        "Người thứ ba:\n" +
                        "\n" +
                        "– Tôi biết phải nói sao đây?\n" +
                        "\n" +
                        "– Đừng ngại, nói đi!\n" +
                        "\n" +
                        "Hai người kia thúc giục.\n" +
                        "\n" +
                        "– Ừm! Đó là: Tôi không thể giữ bí mật!\n" +
                        "\n" +
                        "– !!??", 6));
                stories.add(new ItemStory("Điều ước nhỏ nhoi", "Hai anh bạn đang nói chuyện với nhau, một anh nói:\n" +
                        "\n" +
                        "– Ước gì bây giờ tao nợ một triệu đồng.\n" +
                        "\n" +
                        "Anh kia nghe thấy ngạc nhiên liền nói:\n" +
                        "\n" +
                        "– Vớ vẩn, mày bị khùng hả, sao tự dưng lại mơ ước bị nợ nần.\n" +
                        "\n" +
                        "– Nhưng bây giờ tao đang nợ đến 10 triệu đồng rồi.\n" +
                        "\n" +
                        "– !?", 7));
                stories.add(new ItemStory("Ước mơ của thằng bạn", "Bill, Tom và Jack bị đắm tàu lạc trên một hoang đảo lâu ngày không được về đất liền, buồn quá cả ba khóc om sòm.\n" +
                        "Nghe tiếng khóc Bụt hiện ra:\n" +
                        "\n" +
                        "– Ta cho các con ba điều ước, mỗi người một điều. Các con ước đi.\n" +
                        "\n" +
                        "Bill nhanh nhảu nói:\n" +
                        "\n" +
                        "– Ước gì con được về với gia đình;\n" +
                        "\n" +
                        "Ngay lập tức Bill về với gia đình.\n" +
                        "\n" +
                        "Thấy vậy Tom cũng ước:\n" +
                        "\n" +
                        "– Ước gì con được về với người yêu.\n" +
                        "\n" +
                        "Ngay lập tức Tom được về với người yêu.\n" +
                        "\n" +
                        "Thấy hai người bạn của mình biến mất, Jack khóc lóc:\n" +
                        "\n" +
                        "– Con buồn quá, con là trẻ mồ côi, hai đứa kia hôm qua còn ở đây, giờ về hết còn mình con.\n" +
                        "\n" +
                        "– Vậy con muốn gì – Bụt hỏi.\n" +
                        "\n" +
                        "– Con ước Bill và Tom quay lại đây cho vui.\n" +
                        "\n" +
                        "– !?!", 8));
                stories.add(new ItemStory("Da mặt dày hơn", "Anh không râu muốn chế nhạo anh có râu, liền hỏi:\n" +
                        "\n" +
                        "– Ðố anh biết trên thế gian, cái gì cứng nhất nào?\n" +
                        "\n" +
                        "Anh có râu đáp:\n" +
                        "\n" +
                        "– Cứng nhất chỉ có đá với sắt.\n" +
                        "\n" +
                        "Anh không râu lắc đầu:\n" +
                        "\n" +
                        "– Không phải. Ðá đập cũng vỡ, sắt nung cũng mềm.\n" +
                        "\n" +
                        "Anh có râu đành chịu, hỏi lại:\n" +
                        "\n" +
                        "– Thế thì cái gì?\n" +
                        "\n" +
                        "Anh không râu chỉ vào cằm anh có râu:\n" +
                        "\n" +
                        "– Râu là cứng nhất! Da mặt anh dày như thế kia mà râu cũng đâm thủng được, thì râu chẳng cứng nhất là gì?\n" +
                        "\n" +
                        "Anh có râu liền bảo:\n" +
                        "\n" +
                        "– Da mặt tôi dày thật, nhưng dày sao bằng da mặt anh khi râu cũng không mọc ra được!", 9));
                stories.add(new ItemStory("3 lý do đàn ông hay ga lăng", "Hai cô bạn thân đang ngồi uống cafe với nhau thì nhìn thấy một chiếc ô tô đỗ phịch trước cửa quán. Chàng trai trong xe bước nhanh xuống chạy sang bên kia mở cửa cho cô gái bước ra. Thấy vậy một cô nói với cô còn lại:\n" +
                        "\n" +
                        "– Bà có biết nguyên nhân gì khiến đàn ông ga lăng mở cửa xe cho phụ nữ không?\n" +
                        "\n" +
                        "– Không, nguyên nhân gì vậy?\n" +
                        "\n" +
                        "– Theo tôi có ba lý do. Thứ nhất chiếc xe đó là xe mới, thứ hai người vợ đó là người vợ mới cưới.\n" +
                        "\n" +
                        "– Thế còn lý do thứ 3? – Người bạn tò mò hỏi.\n" +
                        "\n" +
                        "– Đó không phải vợ anh ta!", 10));
                stories.add(new ItemStory("Làm đàn ông thật khó", "– Nếu bạn để cô ấy ở nhà và cố gắng bảo vệ cô ấy khỏi cuộc sống đầy khắc nghiệt, bạn thật gia trưởng.\n" +
                        "\n" +
                        "– Nếu bạn ở nhà làm nội trợ, bạn thật đàn bà.\n" +
                        "\n" +
                        "– Nếu bạn cố gắng làm việc, bạn sẽ chẳng có thời gian dành cho cô ấy.\n" +
                        "\n" +
                        "– Nếu bạn không làm việc, bạn là một kẻ vô dụng.\n" +
                        "\n" +
                        "– Nếu bạn khen cô ấy đẹp, đó là sự quấy rối.\n" +
                        "\n" +
                        "– Nếu bạn không nói gì, bạn thật vô cảm.\n" +
                        "\n" +
                        "– Nếu bạn khóc, bạn quá yếu đuối.\n" +
                        "\n" +
                        "– Nếu bạn không khóc, bạn là một kẻ máu lạnh.\n" +
                        "\n" +
                        "– Nếu bạn quyết định cái gì đó mà không bàn với cô ấy, bạn là kẻ độc đoán.\n" +
                        "\n" +
                        "– Nếu cô ấy quyết định cái gì đó mà không bàn với bạn, cô ấy là người phụ nữ hiện đại.\n" +
                        "\n" +
                        "– Nếu bạn muốn cô ấy làm việc mà cô ấy không thích, đó là sự vô lương tâm.\n" +
                        "\n" +
                        "– Nếu cô ấy muốn bạn làm việc mà bạn không thích, đó là vì cô ấy muốn tốt cho bạn thôi.\n" +
                        "\n" +
                        "– Nếu bạn nhìn các cô gái đẹp trên đường, bạn quá phóng đãng.\n" +
                        "\n" +
                        "– Nếu bạn không chú ý đến các cô gái đẹp, bạn thật không bình thường.\n" +
                        "\n" +
                        "– Nếu bạn mua hoa cho cô ấy, bạn đang có âm mưu gì đây.\n" +
                        "\n" +
                        "– Nếu bạn không mua hoa, bạn thật thô thiển.\n" +
                        "\n" +
                        "– Nếu cô ấy mệt, cô ấy quá vất vả. – Nếu bạn mệt, bạn không còn yêu cô ấy nữa.", 11));
                stories.add(new ItemStory("Chờ vớt xác người", "Hai người bạn ra biển chơi.\n" +
                        "\n" +
                        "Một người nói: – Ê thấy tấm bảng không? Cứu người chết đuối được thưởng 1000 đô. Tao giả bộ chết đuối mày cứu lên lấy tiền thưởng chia nha.\n" +
                        "\n" +
                        "Nói xong anh ta nhảy xuống. Hụt hơi mà không thấy bạn cứu. Anh ta la hoảng: – Ê! Sao không cứu tao, sắp chìm rồi ông nội!\n" +
                        "\n" +
                        "– Tao còn chờ. Mày không thấy tấm bảng khác đề vớt xác người chết được thưởng 5000 à?", 12));
                stories.add(new ItemStory("Đầu trọc cũng rẽ ngôi", "Ông bố mù cho tiền đứa con trai đi cắt tóc. Đứa con vốn tính ham chơi nên tiêu hết tiền.\n" +
                        "\n" +
                        "Về đến nhà bố hỏi:\n" +
                        "\n" +
                        "– Mày cắt tóc đâu cho bố xem nào?\n" +
                        "\n" +
                        "Đứa con không biết làm thế nào đành cởi quần đưa cái mông cho bố sờ.\n" +
                        "\n" +
                        "– Ừm! Mùa hè cạo trọc cho mát nhưng sao lại vẫn rẽ ngôi giữa thế này?", 13));
                stories.add(new ItemStory("Kiếp độc thân", "Cái kiếp độc thân thế mà hay\n" +
                        "\n" +
                        "Tha hồ rong chơi suốt cả ngày\n" +
                        "\n" +
                        "Nào quán cafe nào quán nhậu\n" +
                        "\n" +
                        "Nào là tuý lúy mặc kiếp say.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Cái kiếp độc thân thế mà hay\n" +
                        "\n" +
                        "Chẳng phải nghĩ suy thứ bảy này\n" +
                        "\n" +
                        "Phải xin về sớm và đón rước\n" +
                        "\n" +
                        "Đưa nàng dạo phố ngắm trời mây.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Ơ kìa cô gái áo hai dây\n" +
                        "\n" +
                        "Làm tôi trông thấy, dạ ngây ngây\n" +
                        "\n" +
                        "Cô kia cặp giò…không đẹp lắm\n" +
                        "\n" +
                        "Còn cô kia nữa…dáng hơi gầy.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Đời mãi độc thân riết cũng cay\n" +
                        "\n" +
                        "Lễ Tết ai ai cũng sum vầy\n" +
                        "\n" +
                        "Riêng ta đơn lẻ thân cô độc\n" +
                        "\n" +
                        "Chôn hết nỗi niềm trong men say.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Xuân, hạ, thu, đông vẫn độc thân\n" +
                        "\n" +
                        "Thấy gái thanh xuân cũng muốn gần\n" +
                        "\n" +
                        "Đến khi mở miệng thì lại ngọng\n" +
                        "\n" +
                        "Nên đành trở lại kiếp trai tân.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Cà phê, quán nhậu đều không thiếu\n" +
                        "\n" +
                        "Chỉ vắng một điều nói chữ “yêu”\n" +
                        "\n" +
                        "Xin xăm cầu nguyện cho duyên phận\n" +
                        "\n" +
                        "Để tuổi về chiều đỡ quạnh hiu.", 14));
                stories.add(new ItemStory("Là con trai hay con gái!", "Trong một phòng ngủ của 1 nhà trẻ, có 1 bé trai và 1 bé gái nằm gần nhau. Cậu bé trai quay ra hỏi bé gái: “Này, cậu là con zai hay con gái thế?”. Cô bé trả lời: “Tớ không biết nữa!”\n" +
                        "\n" +
                        "– “Tớ cũng hông biết. Vậy để tớ kiểm tra cho”, cậu bé trai đáp lại\n" +
                        "\n" +
                        "– “Ừ!”,  Bé gái trả lời\n" +
                        "\n" +
                        "Cậu bé trai liền chui dzô  vào chăn của cô bé gái một hồi rồi chui ra bảo: ” A! Tớ biết ồi nhé! Cậu là con gái, còn tớ là con trai!”.\n" +
                        "\n" +
                        "Cô bé hỏi: “Ủa, sao cậu biết dzay?”\n" +
                        "\n" +
                        "– “Thì tại cậu mang tất hồng, còn tớ mang tất màu xanh!”\n" +
                        "\n" +
                        "…Lại Chúa tha thứ cho đứa nào đang nghĩ bậy hehebig grin", 15));
                stories.add(new ItemStory("Truyện cười về chàng cà lăm", "Chàng cà lăm đi mua bánh mì, đầu tiên anh đến 1 quán bánh mì bên đường:\n" +
                        "\n" +
                        "– Bán..bán..bán…bán… cho tui 1 ổ bánh mì!\n" +
                        "\n" +
                        "– ừh! có xịt ớt ko?\n" +
                        "\n" +
                        "– xịt…xịt….xịt….\n" +
                        "\n" +
                        "Bà chủ quán nghe xịt thì bà cứ xịt, đến khi bánh mì ướt nhẹp ớt rồi thì…\n" +
                        "\n" +
                        "– xịt…xịt… ít thôi.\n" +
                        "\n" +
                        "Chán nản, bánh mì đầy ớt ko ăn được, anh ta liền đi vào tiệm tạp hoá.\n" +
                        "\n" +
                        "– Bán..bán..bán…bán… cho tui 1 ổ bánh mì!\n" +
                        "\n" +
                        "– Ừ! 15$ một cái mua được ko?\n" +
                        "\n" +
                        "– Mua…mua…\n" +
                        "\n" +
                        "– Pho-mát ko? thêm 1$\n" +
                        "\n" +
                        "– mua…mua…\n" +
                        "\n" +
                        "– thế thêm gia vị cho ngon ko? thêm 4$\n" +
                        "\n" +
                        "– mua…mua…\n" +
                        "\n" +
                        "– Đây xong rồi đây!\n" +
                        "\n" +
                        "– mua..mua… không nổi", 16));
                stories.add(new ItemStory("Thơ chế linh tinh về…", "Nửa đêm nghe giục trống dồn\n" +
                        "Toàn thân rạo rực bồn chồn quá đi\n" +
                        "Tay cầm một cái ống bi\n" +
                        "Xốc lên xốc xuống cái gì phun ra\n" +
                        "\n" +
                        "Bắn luôn lên áo của ta\n" +
                        "Một màu trắng đục rất là tinh khôi\n" +
                        "Chuyện rằng chỉ có nhiêu thôi\n" +
                        "\n" +
                        ".\n" +
                        "\n" +
                        ".\n" +
                        "\n" +
                        ".\n" +
                        "\n" +
                        "Bóp kem vào bót xong rồi đánh răng! :))\n" +
                        "\n" +
                        "P/S: Xin chúa tha thứ cho tâm hồn đen tối :v", 17));
                stories.add(new ItemStory("Bản Lĩnh.", "Là phải biết điềm tĩnh trước gái xinh và không giật mình trước gái xấu.\n" +
                        "\n" +
                        "Không được đầu gấu với gái ngoan và không cần nhẹ nhàng với gái dữ.\n" +
                        "\n" +
                        "Không được tự tử nếu mất gái ngon và không ngậm bồ hòn ôm gái nát.\n" +
                        "\n" +
                        "Không được bộc phát thích gái teen và không được ném mình vào gái ế….", 18));
                stories.add(new ItemStory("Say rượu.", "Bob say khướt. Anh ta về nhà, đập cửa:\n" +
                        "\n" +
                        "– Ồ, Bob! Anh đã về đấy ư?\n" +
                        "\n" +
                        "– Ừ, em yêu ạ, anh gặp bạn cũ.\n" +
                        "\n" +
                        "– !?\n" +
                        "\n" +
                        "– Anh nhậu hết lương tháng rồi.\n" +
                        "\n" +
                        "– À, em có thể hiểu.\n" +
                        "\n" +
                        "– Xe lại bị giữ…\n" +
                        "\n" +
                        "– Chuyện đương nhiên mà.\n" +
                        "\n" +
                        "– Ôi, em đúng là người phụ nữ hiền dịu nhất trần đời. Ừm… Ờ… hình như cái dây chuyền em đưa hôm qua, anh trót tặng một cô gái.\n" +
                        "\n" +
                        "– Lạy Chúa, em thật là may mắn!\n" +
                        "\n" +
                        "– Sao, em định nói là em rất hài lòng ư?\n" +
                        "\n" +
                        "– Vâng, vì em chỉ là… hàng xóm của anh.", 19));
                stories.add(new ItemStory("Một nửa thế giới", "– A: Sao ông buồn vậy?\n" +
                        "– B: Có người vừa nói tôi xấu trai nhất thế giới này bà ạ!\n" +
                        "– A: Vui lên đi, tôi thấy ít nhất một nữa thế giới. ko đẹp trai bằng ông.\n" +
                        "– B: Thiệt hả?\n" +
                        "– A: Ừa, vì một nửa thế giới là phụ nữ mà.\n" +
                        "– B: Tẽn tò!!!", 20));
                break;
            case 3:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            case 4:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            case 5:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            case 6:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            case 7:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            case 8:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            case 9:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            case 10:
                stories.add(new ItemStory("", "", 1));
                stories.add(new ItemStory("", "", 2));
                stories.add(new ItemStory("", "", 3));
                stories.add(new ItemStory("", "", 4));
                stories.add(new ItemStory("", "", 5));
                stories.add(new ItemStory("", "", 6));
                stories.add(new ItemStory("", "", 7));
                stories.add(new ItemStory("", "", 8));
                stories.add(new ItemStory("", "", 9));
                stories.add(new ItemStory("", "", 10));
                stories.add(new ItemStory("", "", 11));
                stories.add(new ItemStory("", "", 12));
                stories.add(new ItemStory("", "", 13));
                stories.add(new ItemStory("", "", 14));
                stories.add(new ItemStory("", "", 15));
                stories.add(new ItemStory("", "", 16));
                stories.add(new ItemStory("", "", 17));
                stories.add(new ItemStory("", "", 18));
                stories.add(new ItemStory("", "", 19));
                stories.add(new ItemStory("", "", 20));
                break;
            default:
                break;
        }


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemStory = View.inflate(mContext, R.layout.item_story, null);
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT);
        params.setMargins(16, 5, 16, 5);
        itemStory.setLayoutParams(params);
        return new Holder(itemStory);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Holder itemStory = (Holder) holder;
        itemStory.imageView.setImageResource(R.drawable.icon_story);
        itemStory.textView.setText(stories.get(position).getTitle());
        itemStory.textView.setId(stories.get(position).getId());

    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imageView;
        private TextView textView;

        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_story);
            textView = (TextView) itemView.findViewById(R.id.tv_story);
            textView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mContext, ViewPagerActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("STORIES", stories);
            switch (v.getId()) {
                case 1:
                    bundle.putInt("ID", 1);
                    break;
                case 2:
                    bundle.putInt("ID", 2);
                    break;
                case 3:
                    bundle.putInt("ID", 3);
                    break;
                case 4:
                    bundle.putInt("ID", 4);
                    break;
                case 5:
                    bundle.putInt("ID", 5);
                    break;
                case 6:
                    bundle.putInt("ID", 6);
                    break;
                case 7:
                    bundle.putInt("ID", 7);
                    break;
                case 8:
                    bundle.putInt("ID", 8);
                    break;
                case 9:
                    bundle.putInt("ID", 9);
                    break;
                case 10:
                    bundle.putInt("ID", 10);
                    break;
                case 11:
                    bundle.putInt("ID", 11);
                    break;
                case 12:
                    bundle.putInt("ID", 12);
                    break;
                case 13:
                    bundle.putInt("ID", 13);
                    break;
                case 14:
                    bundle.putInt("ID", 14);
                    break;
                case 15:
                    bundle.putInt("ID", 15);
                    break;
                case 16:
                    bundle.putInt("ID", 16);
                    break;
                case 17:
                    bundle.putInt("ID", 17);
                    break;
                case 18:
                    bundle.putInt("ID", 18);
                    break;
                case 19:
                    bundle.putInt("ID", 19);
                    break;
                case 20:
                    bundle.putInt("ID", 20);
                    break;
                default:
                    break;

            }
            intent.putExtra("DATA", bundle);
            mContext.startActivity(intent);
        }
    }

}
