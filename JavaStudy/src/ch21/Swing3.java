package ch21;

import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.json.JSONArray;
import org.json.JSONObject;

public class Swing3 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://dapi.kakao.com/v2/search/image?query=java"); // īī���ּ�
			URLConnection con = url.openConnection();
			con.addRequestProperty("Authorization", "KakaoAK 3e2a3f957517ab9615f511fd550d781d"); // īī�� ������

			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String result = "";
			while (true) {
				String data = reader.readLine();
				if (data == null)
					break;
				result += data;
				// System.out.println(data);
			}

			MouseListener ml = new MouseListener() { // ��ư���� ���콺������ ����
				public void mouseReleased(MouseEvent e) {
					JButton button = (JButton) e.getComponent();
					String text = button.getText();

					try {
						Desktop.getDesktop().browse(new URI(text));
					} catch (IOException ee) {
						ee.printStackTrace();
					} catch (URISyntaxException ee) {
						ee.printStackTrace();
					}

				}

				public void mousePressed(MouseEvent e) {
				}

				public void mouseExited(MouseEvent e) {
				}

				public void mouseEntered(MouseEvent e) {
				}

				public void mouseClicked(MouseEvent e) {
				}
			};

			JSONObject obj = new JSONObject(result);
			JSONArray documents = obj.getJSONArray("documents");

			JFrame frame = new JFrame(); // ��� ��ġ ����
			// frame.setLayout(new FlowLayout());
			frame.setLayout(new GridLayout(0, 1));

////�г�
//			JPanel panel = new JPanel();
//			panel.setLayout(new GridLayout(0, 1));

			for (int i = 0; i < documents.length(); i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");

				JButton button1 = new JButton(image_url);
				frame.add(button1);
				button1.addMouseListener(ml);
			}
			
//			JScrollPane jp = new JScrollPane(panel);
//			frame.add(jp);
//			frame.add(panel);
			
			frame.setSize(500, 500);
			frame.setVisible(true);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
