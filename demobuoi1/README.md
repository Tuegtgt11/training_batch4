+ Object và Class trong Java:
  -Object:
  oThuộc tính(Atribute): thông tin, đặc điểm của object.
  oPhương thức(Method): thao tác, hàng động của object.
  -Class:
  otập hợp các object có cùng đặc tính. Class cũng bao gồm 2 thông tin là thuộc tính và method.
  oConstructer: phương thức khởi tạo, nếu tạo class không có constructer thì hệ thống sẽ tự tạo một constructer rỗng
  -Class là khuôn mẫu còn object là một thể hiện dựa trên khuôn mẫu.

+ Tham chiếu, Tham trị trong java:
  -Tham trị: là truyền giá trị, dành cho các biến có kiểu dữ liệu cơ bản nguyên thủy. Khi truyền biến chỉ sao chép giá trị ko phải ô nhớ => thao tác trực tiếp với giá trị.
  -Tham chiếu: là truyền địa chỉ ô nhớ, các biến trong class, Array, String là tham chiếu(khởi tạo đối tượng sẽ cấp phát bộ nhớ) = > thao tác với ô nhớ của giá trị.
  -TH đặc biệt: kiểu Integer: ngoài khoảng -128 -> 127 khi tạo ra sẽ được cấp phát bộ nhớ mới.

+ Phương thức Equals() và toán tử ==: cả ai đều dùng để so sánh
  -Phương thức Equals(): so sánh giá trị.
  -Toán tử ==: so sanh ô nhớ.

+ Interface và Abstract Class:
  -Interface: tạo ra phương thức khung định nghĩa khai báo biến. Các class implement(thực thi) interface sẽ thực hiện phương thức dựa trên khai báo biến của interface (tính đa hình trong OOP).
  -Abstract: tạo ra phương thức rỗng. Các class extends(kế thừa) abstract là các class con và phương thức sẽ được định nghĩa bởi các class con (tinh kế thừa trong OOP).

+ Autoboxing và Unboxing: chuyển đổi dữ liệu linh hoạt từ kiểu nguyên thủy thành kiểu Wrappers tương ứng và ngược lại

+ Từ khóa final: hạn chế người dùng
  -Biến final:
  okhông thể thay đổi (hằng số).
  oBiến final trống chỉ có thể được khởi tạo trong constructer.
  -Method final: có thể kế thừa, không thể ghi đè(override).
  -Class final: không thể kế thừa class final

+ Từ khóa static: quản lý bộ nhớ, thuộc về class, khởi chạy ngay khi bắt đầu
  -Biến static:
  obiến tĩnh, là thuộc tính của class.
  okhông cần khởi tạo.
  olưu vào bộ nhớ chỉ một lần.
  -Method static:
  ocó thể gọi thẳng mà không cần tạo biến instance.
  ocó thể truy cập và thay đổi biến static.
  oKhông thể sử dụng biến non-static, không thể gọi trực tiếp non-static method.
  oTừ khoa this và super không được sử dụng.
  -Block static:
  oĐược sử dụng để khởi tạo.
  oĐược thực hiên trước main trong lúc tải class.
