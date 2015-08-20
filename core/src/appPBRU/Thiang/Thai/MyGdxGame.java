package appPBRU.Thiang.Thai;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Texture myTexture, myWallpaper;//
	private int xAnInt;
	private boolean statusABoolean = true;

	
	@Override
	public void create () {//เซตค่าเริ่มต้น
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		myTexture= new Texture("cloud.png");
		myWallpaper = new Texture("wallpapers_a_03.gif");
	}

	@Override
	public void render () {// กระพริบ
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		batch.draw(myWallpaper,0,0);
		//batch.draw(myTexture,0,200);
		batch.draw(myTexture,xAnInt,200);


		//batch.draw(img, 0, 0);
		batch.end();
		//increase
		//xAnInt+=500*Gdx.graphics.getDeltaTime();
          //ทำให้ cloud ไปกลับ
		if (statusABoolean) {
			//Inc
			if (xAnInt<927) {
			xAnInt+=100*Gdx.graphics.getDeltaTime();
			} else {
				statusABoolean = !statusABoolean;
			}
		} else {
			//Dec
			if (xAnInt>0) {
				xAnInt -=100*Gdx.graphics.getDeltaTime();
			} else {
				statusABoolean = !statusABoolean;
			}
		}

	}
}
