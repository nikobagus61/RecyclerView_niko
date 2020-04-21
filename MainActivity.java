package com.example.recyclerview_niko;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("Nikolas Bagus");
        fotoMahasiswa.add("https://1.bp.blogspot.com/-x5V52aHIs-U/VApWFSR4fQI/AAAAAAAAAq4/e0eWRhvgSFk/s1600/67.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("311710431");

        namaMahasiswa.add("Nissa syabyan");
        fotoMahasiswa.add("https://media.alkhairaat.id/wp-content/uploads/2019/05/AKTUALITA_KAKI.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("311710409");

        namaMahasiswa.add("Gea youbi");
        fotoMahasiswa.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTwm4DRccKwAvlKPZ7uS-rNbcyUZRqsivxFMuJYgDPmcbMX7yg-&usqp=CAU");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("311710828");

        namaMahasiswa.add("Gritte agatha");
        fotoMahasiswa.add("https://thumb.viva.co.id/media/frontend/thumbs3/2019/12/05/5de843f6e9d51-gritte-agatha_665_374.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("311710987");

        namaMahasiswa.add("Chelsea island");
        fotoMahasiswa.add("https://www.nusabali.com/article_images/50144/chelsea-islan-imbau-pemuda-tak-golput-800-2019-04-08-142033_0.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("311710409");

        namaMahasiswa.add("Milea");
        fotoMahasiswa.add("https://media.suara.com/pictures/653x366/2019/02/07/26028-vanesha-prescilla.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("311710828");

        namaMahasiswa.add("sheril");
        fotoMahasiswa.add("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhUSExIWFRUXFxUXFhcXFRUVFRUVFRcXFhUVFhUYHSggGBolGxUXITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGxAQGi0fHyUrLS0rLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS4tLf/AABEIAOEA4QMBIgACEQEDEQH/xAAcAAAABwEBAAAAAAAAAAAAAAAAAQIDBAUGBwj/xABBEAABAwEFBQUGAwYFBQEAAAABAAIRAwQFEiExBkFRYYETIjJxkQcUobHB0SNCUhUkcoKS8DNiwuHxNENzorJT/8QAGQEAAwEBAQAAAAAAAAAAAAAAAAECAwQF/8QAIxEAAgICAgEFAQEAAAAAAAAAAAECEQMhEjFBBBMiMlFhM//aAAwDAQACEQMRAD8AZOize1149nSLQe8/IcQN5/vitBaXwFzS/bf21YkeEd1vkNT1KlsiiuCNBBQUBBAokgDRBBBAwFHCJG1MAwEaCMBABIJUI0AIQhKUu7bsrWh/Z0KT6r/0saXQOJ4DmU0JuiucEIVnfNx2qykC0UKlKdC9pDXfwu8JPkVWqnaFYlHCTCUgYRQRwiQAEJQQRQAlBBBFACURKNEUAFiKCJBAHQtrby7OkQD3ny0cQI7x9FgWqx2it/bViR4W91vTU9Sq8JMSQaCCCgYESCCAAgEEYCBhFKCEIwmAbQlIgjQICCMBHCQApsLiAASSQABqSTAA5kruVx3QLusraWWM96s4fmqEeGd7W6D13rCeye4u3tfbuH4dnh3nVM9mI5Zu/lC321NrgRK3gtWQ3bJNivpr5pVmtqUn5OY9ocwzxBWX9ofs1oii62Xe0gMBdVoTIDBm59Oc8t7eAy0gx/eIWv2Q2gkhjj3m6z+ZmnWPsrlESdHnzCiIW99pWyTrFaXvpsPu1Qh9NwEtZjzNMndBmJ3RCx2BZPRfIhQiIUwsSTSHBTYyLCJSjSCSaKVgRkJUjsUk0ijkAzKIpzsyiwqrAbQS8CNAC20XH8pTrbI87lZ2UAGHiODvynkeCsKVEYsgtViTJ5Gar2ZzPEPqm4V1aqrA9zX0STMHOJG466RCQKNnd+Wq3yId8CspRj4ZSspygp9ou+PA4uHNpafsUx7m/wDSVnaKpkdKT3uj/wBDvQpPYO/S70KLQUxtKajwHgfRJB15JiehYCUEKDS4SBviN6fp2V7jhaxxO4BpJPQJWFMZVhc9zVbS/DTblvcfC3z+y0dwbAWiqQ6s00mcD43dPy9c11S4rgp0A0BoDRmAB81HO3USuNK2I2ZuRl32NtIGXOJe9xABLnbjyAAEcljL1tFS0VSKbS5oMYvyzvz3xyW1vyuajuxaTieDMZYKejnE7p0G/WJhCy3O1oAktA0DA0AdXAz0haZM/DSHDE5bMJ+wahzcZ6mPJJpWN1JzXtkOaSQZPUawRGUc10r9j0j+ueIqPHwBj4KuvXZ0tbia9xGmcGPUfZZLPJmntJFzdYZeFjDagBOEsqNOhGh+46LkO1/s/q2UudSmoxsyD42jWcvGI36rf7GW51GsaTwBOYI0MeLI5jKOPhWxv2zYgKg4QfLULrxyU1s5MkXBnlgtRLoW3myGHFaaDctajBu4vaOHEdVz9wUzjxHGVjbkSVCIrMsJJSkUIEJQIRwiSATkjRoIAtrPVGh3qdY6ZaZb3mDNzd4G8tP0TJpaQNdFb3bYsOZ1XoJGVlbfDWvrEiMhh6DQ/FFRsnJaS76THl1J4BIzbIzwngeR+YTdrut1OSJczjvb58ua4vUYZJ8ls6sWRdMq6VlUmnZOSepwn6ZXA7OpDdOxhSWWMcEpj0+16kAmWNvBczvsRaKwGmM+hz+q6h2q5xtDTw2qpMQYcMjmIjOI3gro9NqTMM60dH9kdCn7sXkCe0dn5Bvpkuk0rXTHDguL+z+1Hs6o8Le0GFomAcIxaknPLU/NbD3nLUqMkPmyse4o3ptFOJ3qBbLxbTpuqOMAAknkOHyWV/aBJDQZLiGgcyQAoe117BtSlZwMQaBUc3iQYp4hwkExyC1xLinInIraRorpY4g1XiH1DiI/S38jOg+JKuKLVzahtVWa78Rpg8Bl6rVXLffacuS5Xd2zddGoYVOZhIg6FZ+02vCJVDUvy0E/htz3b1SexNWWW0N3OouFVn5TiHTVpK2F0WplegI3t+aw9O87SWltdndIg5ehzVjsPeAD6lD9MEfwuk5dQfVdWCW6ObOrjZLr2fNzSuK7dXGLNXlginUlzf8AKRGJvxBHI8l3y8aUVQeIWJ2xuQWpjqI8cl1M8HhpLQeR8J813tconEnTOJkJKeqMIJBEESCDqCNQUyVyNUdCElBHCJIYlBGkpCDQQQQBraFDD4f+Va2d065FVFge4af0lkD4Ex0AVr79Tb/iwzmSI9dfUBekZUC0gtcKjTDhmD9PLd1V1TcazBUpGHA5tOk72nhxlUle204ye1w5OBUG79oWWeqD3nMdAeA0nKfGOY15iRwSYFy+ytqTAFOoPE0+EnmB4TzGWeh1UCu40zDxhPPQ+R0PRau3WJtQB7XAOjuvGYIOYkZYm7/lGa57tFbLayq+mKndbGVIQIIBz1dOfFcmbDGW0b48rRZut7Rq5o6hNm+qQ/7jfWViSSczmeOs9UAFy+0jb33+GxdtFS/WT5NP2VJetoZVeKjZgDC6QARvBg7syqsIALSEeLsznkclRfXHebKAdIJDnEiIJ0aMxqNFf2faOg4xiI8wR8VhWhLCJxt2EMjiqOsbOgVK2IZhjC6ebiGD/wCyeiq6zmPttd9R2XaYZJ0FNraeH1aT1KV7JGF3bkkxNJuZyAHaOP8ApTdTZavXiq0GKj3VuHjeXgkHzU5PjCjXE+U7NB77dtRjm9rRDhGjxkTpMn5qPszZT7y6nwA9DmCo92ez5he59ZpdieXmahw4iScmU8PE6u36Lc7P3Qym8YRk0ADkBoATuC5JV1E6N1sO97tIbA4LInaGjZS4vPgjFDS6JIABjTMj1XUHNBKyG0uxjKxOFoAdGKBAMGRiwkE9ShK3slS1RAZtvYrQMDaoDspDwWHONMQ5pN3WkU7WwgjvSw9YI+LQmrt9mFEE4mgA6hr35gGQO9MZ+am31skKDO0s4IDIdhkmC3MEE7slomoytCaUo0+zaW3vdm4cCs/bW/vA82/IK7sFQVKTHcQCOolVFqH7z5EfIfZexDo8mUa0cg9pl2ijbHOaIbWaKg4Yj3Xx/MJ/mWPK6X7ZKcUrJV3zVZ0dhcP/AJ+K5Yf4s1hlh8jWEtEhJKbo1M4KeWBohBRQlEJJQAEEUo0hG1stliMb3OO5uIgeZGgCtG2cEd4A8o7o6KvY+TLRrxy+asrO0nUr0WY2HZ7BTMwxvAkNA5qLbtnQ/NuXmNVOF1UnOxubJ8zl5QULbdoDYplwc4/qdkNSdfIdUmykL2erVKDewrNdgGI06mrRALix3DQkHpwS23fLjViHP73qNPRUrblqudEnPLNx369Ft3NGnopGzn+2ly0hS95ptwuxAPAyBneRuM71jGsJ0BPku1WiytMtcAWVNQQCMQzGR4/RKsd0UqIOGm1szo0R0CylC2NM4mlALa7R7FVO1L7M0FrjJYSBhJzMTkR8lVV9kLWwSWA8muBPop9thyRRAKXddhdXqNpMGbj6DeTyAV1ZtjbQ6kargGAAnCZxGPLRa72PbNGq2vaCQMJ7IE7sg58erUcP0LssdnbGyzU6zG6CmAeZecJJjf3lsbreC1ZC2CHV2gzkzTfhfOSsbrvCIBXN6vtHX6bo0V6WltJmN2kx8CfoqK6drKcFwLSzPvBwcMuYOSZ2qtPaMZTxuaAcRwmDMQJ4iCclU3FclEx3mNBPelwBdl+nQ+nFciOpKzW3XtbZbSSKdQFzdYMjPTNaGjVkZqjs+z9lbUbUMyDIAIDSdROECRyV054GYTIkkPSAodqqpFa0qFWrShsSVE3Z9n4eHc0uaPIOLR8IVRWfNZ7xvc+OkgKyuitgo1KnAvI88TgPjCrLDSl7RwEn6epXr4LpP+HmZvszCe27KhZWbw956BgB+YXICur+2K0Yq9Jn6WOP9To/0LnZpjgozS+VBCOiHZ2b0+QnMCIhYt2adDZCIpwhIISGJQSkSALqx36SdGjnmVettFWJkQd40XPQ6M1d3Je5YcJMtOTmnSOI4FdUMt6Zm4mys9c5Srh9aHAxlhj1P+wWaquwkcCdVpSJZ0C1sSJlleCZUqqYEqssT1OrOyKlgSatPE0+oT47wB/yn4wm7A7EweUI2mAB5j+/VIaJtChIB5D5KfdtwCs+XDujXieSkXJZ8U8iFqbPSDRAUylSDjspbbs+3D3N24pvZa7adKzVGMYGhz6pc1ojvGGmBuOS0RUexUcIdze939RmFm5NqmVxOU2ungrlp/MCJ8iHT6NKbfTIcrvbuwkVC9ozBDm8JyPzlVbKoqND27/XgQecgrP1EeSs3wSrRR3jSrOeM/w94GRPLECCB5QeaeoU7KDBokE5OaKlYA8y0PhWvnore66tDIGg08yJ+a4ZI9LFn4qqKyz3cXNPuz6lE7pe+rSng5lVxy/hgqwuypaaZwVi082E4T5A6K4qAatAA5ZKvtrt6gic+RKfUTL3KCLan7G4POZhrc3HlwHEnQdeC0hByZhOVIs6jcNGnS3v77uQGYHV2asbpu/uF5/Np5DT79VSWZzrRXazc7N3BtNu75Aea2NtrtpUn1Dk1jXOPINE/Reo24Kkea1ydnnP2iWjtLfW4NIZ/SBPxJWXc1S7baDUe+o7V7nOPm4kn5qM4rCTt2aLobISXBOJKkY2QkkJxyQgBEIJaCAKvElByIZpBViL2wX6Qzs6mYywu3tI0nlu8vILod32oPpBw0IXHwCtJsztEKE06klh0I1Zxy3hawn4ZLR0GxP+asHHJZq7L2pOktqAjjp6g6K8FqYQCHAjiCtSSdddfDkdCplR4xt4AOPTL6wqJt4MBAHwU81sz5QOpM/IIKN3sQ4vpOeR+cgdJ+hCtbQKx0y5iFD2Hb+6tPFzz8Y+iv4WN0yjN2m7bQQSKjp5Oj6q7uthbRphxl2Bsk6kxmfVSHjJFSENA5BJuwRUbR3f2jJ4DPyXKbaH2SqSATTce8N4P6hO/lvjyI7e5srEbVXKDOWRmCqjTVMafF2Zyy1qdUS1wP8Ae8bk+2kRoVm33a9jjhDsuCkNtddu5x6Z/ELGeD8OmOU1DLW4DMKNarQ525R+wtEYg4OBzbk0A8M4yTliDy0F4wOgYmyDhPDENeiiPpgeZIRTs7jy57v91Po0CQGN01PM8SnadPqtDc9293GRmch5LphjjBHNkyOQ/szd4ptL97sp5D/f5KLt/UPudWmNXseOgaZ+nqtExoaAAsdtDWNTtCdA1zR5AGURXKVmb0jzu4lILwlkpJCwZaClEicwJMHikMUSm3FAkpi0Py0QIdxjijUGeSCAGQ5IcUSKFoA61yMwmwUolIBdKs5jpa4tPEGFZ2W/KjT3gHjn3T6j7KoIQaVaYmjWDaBkDuOaRnIdPzhb6wW5rhMyIBy5gH6rj9NkhaLZGvUNdtNx7kEk56MBgc5yCuMndMNHpfY4fulLmHO/qe4/VXSqtlmxZKH/AImH1E/VWqz8lAKAREo0ABNWig14hwkJ1BAGZt1zhpyzB5KvdYBwWwtVLEIVY+xHgtoyTWzN2mVtzWAdjUy0f3fRsjy1TFWxA7lobnpRTPNzvspIsbOHzU86bse2ZyxXcXHTJaanSAAA0CW1gGQEIyolKxpUR7bUIbA8RyH3VFbbsIovJ/S4n0Kv6Qkl3QeW8+vyVXtna+xsNpqaRSeB5uGFvxITjKhNXs8vPTbk48JolRIoOUkokRcs6AMptyMlJcUUwAgkygimLiisc1EErNHKsYjCgnMKIIsBTQkvZCPEEstSsdD9lduWguKyPdUDmDJhBJ3ZmInnmqS7aL6jmUaTS6pUcGtaBmSTAC73eOzNG7LqaDBewl9WppieW98+UhrQOACuPZLVG62TdNjof+No9BH0Vss17PbV2lhpHdDh/wCxI+BC0qb7GiPanQWfxfMEKQFEvEd0Hg5p9CpQSDyGggggYE3V0PkfknExbarWsc5xAaGkknQADMnogTEXd4B1+ZUpUOxl7NtVnFVoI79QQdR3pA9CFfJvsF0BR7S/cNTkPunaj4EqLZu84uPkEhNkqmIEcFQbc3LUttkdZ6bwwuc0kkSCGmY1yzA9Fd2V8jqU9CNph4PL+0OzFqsZ/GpEN3PAJYf5vvCz5C9Z3pQa+m5rmhwI0Ikei4vttsK2DVsrYImaY0I/y8DyV8eStEXRzJJKW9hBgiDzTZWdUXYkpJKUSkpDCQQQQBBQwIw0o4KVMLCGSWAhCU1JoEwuyCU2jzSgFpNhtn/fLSGuyos79VxyAaJOEndMHoCjbA6D7F9km0Gm8rTDe6exDoAYw+KsSdC4ZDlPFMe0S+696A0rK0+7U3AlziGCo/KC5zyB5N13qfeNu9+cc3UruoR4RhNpcBDMMwCCYDRoBB1OWmdYALO5optaH0++xoMMxQ7C2GgATvkSTKG34NVUVbVsn+yqiWXXZmmZDXTOs43a8Frlm9hHfuVHjhJPmXEn4ytItPJle2R7c2WO8inaT5APET6oVWyCOIUW6XzTA/SS30OXwhHgPJNQQQQMS94GZXNNtdpDaP3eifw/+48fnI0aCNWz6wN2u8vm7TaG9mXljD48MYnDc2ToOOXBNXfs7ZqMFlJsjRzu86eIJ0Pkrg0tsmSbIWw91Os9nDXCMRxEHUE6z0gdFoiUAEh5Uyduw6QxaXTl/cp5jIEJFKnnJ6fVPkJP8FFEWxmJHNS1De3C6VKa5N9hFjdoZLSFmLwowtY4KjvdgBWmGVOiMiOV7ZbHCvNaiAKm8aB/2dzXMrbZKlJ2GowsdwII/wCV6GdTWD9pFoYKBZgxEkDFHdpnXN24kDRa5MadsiE2nRyohJKdcE24Lko3QSCEIJbCyIKhShU4hSWXe7eUp125ZFW4xJtjQE6JYpqKJBg5FW1jhzeayyLiUmQ+zWsuh76dJlkptc59Y9tVEE42N/wqMDVuTnuzjQbiq27ruNWrTpgZvcB8RPwlbzamye6VqFdshpDqT4Jb3cIEYgCWiJEgTwzCIbVlxrlRqbysvbUKYGNzC5rnNaIGEYXMBJzDcWAwNzSJ3JraC+H2ez1XOcQ2IgntDLhhpnKATIHdmImSDoVyW8M/CnE2QxlQNAbUcI/Da1sxBDg06EU3AF2ElTbw2YZXqB1p77RGCiCQJyLnVSDrIAwtMQ0STEJLE3L+FOdKmWOwlY/s2yVHHPs2lxyzLszpzK2FF8gEKkueizsTSaxrGtJaGNEMaIyDRuHJQ7FebqLix2YBhdDjZzqW7NUUzZaGCebifVJs9ra8SFIBUUWmmGggm69XC0uO4E+iChxBQqN4NdyUsPQ1XYrFFNESUtyJjYSE9igEaCCZQlzZRMbCWiJQKgFUN9VBi8lZ262tptLnECFkqtU2gl0lrJyjJzh57h8fJa41uzObsrr7vQ02FzWkgGHviW0wfzO4xy03wFnLysDazCQcdMgtLu69wxOLnOncTi1y8DRK3IpgCAIA0Co7RcLA7HQPYPj8jR2btc30xGI5nORrnK35EddHErfZDSeWOzjQwQCOMHRRHLrl77IvtLT2rqbHA93s2kg5eJ0xEkaAAZrnF+XDXspAqsgEkNcM2OjWDx5HNc040y7KmUEqEFNAT30zGScslJ35kmkDGRlKoVxiwgGBqSi0DHaliac4EqJUY5rcuOane994M8M7zok0xUfVNFlMnFlxHMk7mp8VLsnZd+z+g5r/AHl+bQ7A3kTq7pp6rqFtsFK2UKlGe9icBvLXjNrh6joSq+6riDLBUaB4WjONS2HOPUkrTbPWDs6bHvHfw5bjBA15rTjGqSGpNDOymz/uNnaKj8dUBxG9tLHEsp74neeLogGEdeo4kxx1U+2Pc5HZLF2hEnIeLjyhCSigcm2R7gcWueCfFB6j/lM33SGLGN+vmr+1WTu/hiMJkDidCJ8vos3b60pwaexNUS7orRAWlpOWHsdowkD0WssFaQlkj5BOifiTFtqNDYdo4hvr/wAJupWg6pi9mFzBG4ys+LtFcyNabuLc2GR8R903YrwLDhdMJdmvAsydmEq22ZtQY2ESMyFp/JAy3o1Q4SE6s9dVvg4HFaAFZyjxZUXYaCCJxUlgJVLtFtDRstMvqOA3AbyeAG8rP7e+0KlYWhjPxKzgcInuiNS5275rmNjp1rdU94tTy6c2t0aBrAG4cvWVtjx3tmTkbSneFa3uxOBbSByG7qfzHy0WkoUAAAFUXVZzhBPdaMgNJ8uAVtZ60khWyR1zAmiE7UKaKEIacxZzbi6qlpsb6VNoLw9tRo3ktDgWt5kO+C0pRJPYI88/s2t/+NT+h32QXofCjU8EOzzwZaMil2LN2vRE8GQlVKZaMYIncuCEXKPZb0x+02J1WrTaBM5QOOv0XQtmbjbQAbq85vdrMHJo/wAsqq2Vs8UxVfGIj0C3dwWQuz3nPpuXbhi4Y0mQ9s0tztHu4bGbi7F5Yj9lZmzlyau+zBogf3vVi0Ik66CrI4sgjNKpgNENynRPOVeKuEF79GiG/Nx+XpzUbZTVFiNFQbRWDLtGmOIOk8eSxl+e0a0F7qdlpta1pw9o/vEka4WiAOsrNWy0Wu052ivUe39M4aeW7A2Gk57wujHgknbM55l0i+N7Uy8tD2lwOYDgT8NVe3XfOEayPkuP3vZQagyya0RyMn7BWGzQrtxPbVdhEDC4lzSdTrpAjTiuiWJUZqdnZxeAdnxV3Y6mIDyXJ7Ff2Ew8Fvxb/st9s9ejXAQZBXPkhrRrFlhb7vEEt9Fm69Ut0MK+tl2VX1C9ldzWkCWyS2RlIbpnkqW/bs7FmOo8uGggxJ4QFON+GORXftFo8TgOc6eau7v2ma0AVDludOvkd65/WsWM4iOnDkgywwtXBPsSZ0i1bZ2ZoyJceAH1WYvXamvX7rfwmcj3iObt3RUtOyRuVXtJeooMIb4ikscVsHIx+1lsFS0GM2sAYP5ZLj6krpt1+7MosION5AO8NaI05rjbs5Jzkz1K1+yVrc5mH9OXTcohK5MlSs6O21Sp1gdLiVQWNpyV3YMloUWbk2UtJcEgGnJsp1yQ4oSARjPFElIIA4QNEyzxf3wQQXlem+5rPo3ez/8A07fIrpeznhCJBepMzNLYt6lBBBc8uxxCcqHaD/BHRBBOHYZDjtl+v1K1Ft/6Ol5/VyCC9BnH5ZiLx8R8h9VZXH/hfzO+iCCeToMfY9aNP74rRbFeHqUEFizeJ0y7/Asxt9rR/n+iCC5I/wChrL6mbZolNRoLpXZmE5c02u8Z80EFUvqyWZ9a7YT838Q+SCC5cP2EvB0Smp1l3IILoNCyCJyCCBjT02USCAAgggkM/9k=");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("311710987");



        prosesRecyclerViewAdapter();

    }
}
