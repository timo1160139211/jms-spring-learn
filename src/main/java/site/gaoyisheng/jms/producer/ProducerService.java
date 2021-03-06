/*
 * file_name: ProducerService.java
 *
 * Copyright GaoYisheng Corporation 2017
 *
 * License：
 * date： 2018年2月24日 下午2:53:14
 *       https://www.gaoyisheng.site
 *       https://github.com/timo1160139211
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package site.gaoyisheng.jms.producer;

public interface ProducerService {
	void sendMessage(String message);
}
